package com.example.demo.dto.response;

import com.example.demo.dto.Info;
import com.example.demo.dto.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Project demo1
 * Author: jimmy
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private User[] results;
    private Info info;
}
