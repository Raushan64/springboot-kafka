package com.kumar.springbootkafka.payload;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}
