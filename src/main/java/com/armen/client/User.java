package com.armen.client;

import com.fasterxml.jackson.annotation.JsonGetter;

public class User {
    private String name;
    private String secondName;

    public User(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @JsonGetter("Name")
    public String getName() {
        return name;
    }


    @JsonGetter("SecondName")
    public String getSecondName() {
        return secondName;
    }

}