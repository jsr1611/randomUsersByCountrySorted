package com.example.demo.dto;

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
public class Login {
    private String uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}
