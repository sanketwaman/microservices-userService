package com.userservice.entities;

import lombok.Data;

import javax.persistence.Id;
@Data
public class Hotel {

    private String id;
    private String name;
    private String  location;
    private String about;
}
