package com.mycompany.nutritionplanner_springboot.DAO;

import com.mycompany.nutritionplanner_springboot.Entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
    // Методи для взаємодії з базою даних будуть автоматично створені
}
