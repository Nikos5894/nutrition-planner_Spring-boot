package com.mycompany.nutritionplanner_springboot.DTO;

import java.time.LocalDate;
import java.util.List;

public class DietPlanDto {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<DailyPlanDto> dailyPlans;

    // геттери та сеттери
}
