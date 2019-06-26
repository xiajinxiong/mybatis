package com.example.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Car {

    private String cn;
    private String brand;
    private long uid;

    public Car(String cn, String brand, long uid) {
        this.cn = cn;
        this.brand = brand;
        this.uid = uid;
    }
}
