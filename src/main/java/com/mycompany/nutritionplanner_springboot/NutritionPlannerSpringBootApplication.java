package com.mycompany.nutritionplanner_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NutritionPlannerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(NutritionPlannerSpringBootApplication.class, args);
    }

    @GetMapping("")
    public String hello() {
        return "Hello World! test port 8081";
    }
}
