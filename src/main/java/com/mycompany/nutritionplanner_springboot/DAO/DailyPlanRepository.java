package com.mycompany.nutritionplanner_springboot.DAO;

import com.mycompany.nutritionplanner_springboot.Entity.DailyPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyPlanRepository extends JpaRepository<DailyPlan, Long> {
    // Методи для взаємодії з базою даних будуть автоматично створені
}
