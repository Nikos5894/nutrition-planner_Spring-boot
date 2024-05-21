package com.mycompany.nutritionplanner_springboot.Mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public UserMapper userMapper() {
        return UserMapper.INSTANCE;
    }

    @Bean
    public DietPlanMapper dietPlanMapper() {
        return DietPlanMapper.INSTANCE;
    }

    @Bean
    public DailyPlanMapper dailyPlanMapper() {
        return DailyPlanMapper.INSTANCE;
    }

    @Bean
    public MealMapper mealMapper() {
        return MealMapper.INSTANCE;
    }

    @Bean
    public RecipeMapper recipeMapper() {
        return RecipeMapper.INSTANCE;
    }

    @Bean
    public IngredientMapper ingredientMapper() {
        return IngredientMapper.INSTANCE;
    }
}
