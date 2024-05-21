package com.mycompany.nutritionplanner_springboot.Service;

import com.mycompany.nutritionplanner_springboot.DAO.DietPlanRepository;
import com.mycompany.nutritionplanner_springboot.Entity.DietPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DietPlanService {

    private final DietPlanRepository dietPlanRepository;

    @Autowired
    public DietPlanService(DietPlanRepository dietPlanRepository) {
        this.dietPlanRepository = dietPlanRepository;
    }

    public List<DietPlan> getAllDietPlans() {
        return dietPlanRepository.findAll();
    }

    // Додати інші методи для реалізації бізнес-логіки, які вам потрібні
}

