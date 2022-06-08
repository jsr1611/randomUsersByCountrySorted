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
public class Picture {
    private String large;
    private String medium;
    private String thumbnail;
}
