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
public class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Coordinates coordinates;
    private TimeZone timezone;
}
