package com.mycompany.nutritionplanner_springboot.Service;

import com.mycompany.nutritionplanner_springboot.DAO.DailyPlanRepository;
import com.mycompany.nutritionplanner_springboot.Entity.DailyPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyPlanService {

    private final DailyPlanRepository dailyPlanRepository;

    @Autowired
    public DailyPlanService(DailyPlanRepository dailyPlanRepository) {
        this.dailyPlanRepository = dailyPlanRepository;
    }

    public List<DailyPlan> getAllDailyPlans() {
        return dailyPlanRepository.findAll();
    }

    // Додати інші методи для реалізації бізнес-логіки, які вам потрібні
}
