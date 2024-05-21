package com.mycompany.nutritionplanner_springboot.Service;

import com.mycompany.nutritionplanner_springboot.DAO.MealRepository;
import com.mycompany.nutritionplanner_springboot.Entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    // Додати інші методи для реалізації бізнес-логіки, які вам потрібні
}
