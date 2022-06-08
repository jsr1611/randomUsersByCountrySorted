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
public class Response {
    private User[] results;
    private Info info;
}
