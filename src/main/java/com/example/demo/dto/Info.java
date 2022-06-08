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
public class Info {
    private String seed;
    private Integer results;
    private Integer page;
    private  String version;
}
