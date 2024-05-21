package com.mycompany.nutritionplanner_springboot.DTO;

import java.time.LocalDate;
import java.util.List;

public class DailyPlanDto {
    private Long id;
    private LocalDate date;
    private List<MealDto> meals;

    // геттери та сеттери
}
