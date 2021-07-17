package com.nuritech.excs.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class KafkaSample2Application {
    public static void main(String[] args) throws Exception {
       SpringApplication.run(KafkaSample2Application.class, args);
    }

}
