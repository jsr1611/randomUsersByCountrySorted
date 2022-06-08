package com.example.demo.service;

import com.example.demo.dto.Response;
import com.example.demo.dto.User;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Project demo1
 * Author: jimmy
 */
@Service
public class UserServiceImpl implements UserService{

    /**
     * Get user data from external API
     * @return
     */
    private Response getUsers() {
        String urlStr =  "https://randomuser.me/api/?results=300";
        URL url;
        HttpURLConnection connection;
        InputStream responseStream = null;
        try {
            url = new URL(urlStr);
            connection = (HttpURLConnection) url.openConnection();
            responseStream = connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(responseStream == null){
            return new Response();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(responseStream));
        Gson gson = new Gson();
        return gson.fromJson(reader, Response.class);
    }

    /**
     * Get user count by nationality
     * @return
     */
    public Map<String, Integer> getUsersCountByCountry() {
        Map<String, Integer> result = new HashMap<>();
        Response resultJson = getUsers();
        List<User> userList = Arrays.asList(resultJson.getResults());
        for (User user : userList) {
            String nat = user.getNat();
            if(result.containsKey(nat)){
                int count = result.get(user.getNat());
                result.replace(nat, count, count+1);
            }else {
                result.put(nat, 1);
            }
        }

        return result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
