package com.mycompany.nutritionplanner_springboot.DAO;

import com.mycompany.nutritionplanner_springboot.Entity.DietPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {
    // Методи для взаємодії з базою даних будуть автоматично створені
}
