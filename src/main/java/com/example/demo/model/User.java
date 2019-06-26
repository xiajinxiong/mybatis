package com.example.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@RequiredArgsConstructor
public class User {

    private long id;
    private String name;
    private List<Car> cars;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
