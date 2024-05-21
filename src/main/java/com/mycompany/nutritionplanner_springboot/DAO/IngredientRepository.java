package com.mycompany.nutritionplanner_springboot.DAO;

import com.mycompany.nutritionplanner_springboot.Entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    // Методи для взаємодії з базою даних будуть автоматично створені
}
