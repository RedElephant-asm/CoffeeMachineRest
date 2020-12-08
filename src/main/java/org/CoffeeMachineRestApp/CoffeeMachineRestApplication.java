package org.CoffeeMachineRestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@SpringBootApplication
public class CoffeeMachineRestApplication {
    public static void main(String[] args) {
        System.out.println("Started...");
        SpringApplication.run(CoffeeMachineRestApplication.class, args);
    }
}
