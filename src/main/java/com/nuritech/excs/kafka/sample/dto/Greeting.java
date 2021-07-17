package com.nuritech.excs.kafka.sample.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Greeting {
    private String msg;
    private String name;

    public Greeting(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }
}
