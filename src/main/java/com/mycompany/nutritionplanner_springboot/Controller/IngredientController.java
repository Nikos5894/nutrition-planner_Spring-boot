package com.mycompany.nutritionplanner_springboot.Controller;

import com.mycompany.nutritionplanner_springboot.Entity.Ingredient;
import com.mycompany.nutritionplanner_springboot.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    // Додати інші методи контролера, які вам потрібні
}
