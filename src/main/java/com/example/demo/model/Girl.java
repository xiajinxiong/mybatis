package com.example.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Girl {

    private long id;
    private String name;
    private User boyFriend;

    public Girl(long id, String name, User boyFriend) {
        this.id = id;
        this.name = name;
        this.boyFriend = boyFriend;
    }
}
