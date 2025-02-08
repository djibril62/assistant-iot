package com.devassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssistantIotApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssistantIotApplication.class, args);
        System.out.println("🚀 Assistant IoT lancé sur http://localhost:8080 !");
    }

}
