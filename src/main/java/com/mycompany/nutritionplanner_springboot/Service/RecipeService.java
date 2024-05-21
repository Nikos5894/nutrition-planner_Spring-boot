package com.mycompany.nutritionplanner_springboot.Service;

import com.mycompany.nutritionplanner_springboot.DAO.RecipeRepository;
import com.mycompany.nutritionplanner_springboot.Entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // Додати інші методи для реалізації бізнес-логіки, які вам потрібні
}

