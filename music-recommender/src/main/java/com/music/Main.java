package com.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("===============================================");
        System.out.println("       Telugu Music Recommender Web App");
        System.out.println("       Running at: http://localhost:8080");
        System.out.println("===============================================");
    }
}
