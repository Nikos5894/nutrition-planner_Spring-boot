package com.mycompany.nutritionplanner_springboot.Controller;

import com.mycompany.nutritionplanner_springboot.Entity.DailyPlan;
import com.mycompany.nutritionplanner_springboot.Service.DailyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daily-plans")
public class DailyPlanController {

    private final DailyPlanService dailyPlanService;

    @Autowired
    public DailyPlanController(DailyPlanService dailyPlanService) {
        this.dailyPlanService = dailyPlanService;
    }

    @GetMapping
    public List<DailyPlan> getAllDailyPlans() {
        return dailyPlanService.getAllDailyPlans();
    }

    // Додати інші методи контролера, які вам потрібні
}
