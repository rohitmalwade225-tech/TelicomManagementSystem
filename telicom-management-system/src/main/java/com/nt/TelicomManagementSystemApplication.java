package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nt")
public class TelicomManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelicomManagementSystemApplication.class, args);
    }
}