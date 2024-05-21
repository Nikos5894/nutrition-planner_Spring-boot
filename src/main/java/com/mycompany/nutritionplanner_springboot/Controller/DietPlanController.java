package com.mycompany.nutritionplanner_springboot.Controller;

import com.mycompany.nutritionplanner_springboot.Entity.DietPlan;
import com.mycompany.nutritionplanner_springboot.Service.DietPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diet-plans")
public class DietPlanController {

    private final DietPlanService dietPlanService;

    @Autowired
    public DietPlanController(DietPlanService dietPlanService) {
        this.dietPlanService = dietPlanService;
    }

    @GetMapping
    public List<DietPlan> getAllDietPlans() {
        return dietPlanService.getAllDietPlans();
    }

    // Додати інші методи контролера, які вам потрібні
}
