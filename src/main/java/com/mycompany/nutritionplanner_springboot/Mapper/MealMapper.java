package com.mycompany.nutritionplanner_springboot.Mapper;

import com.mycompany.nutritionplanner_springboot.DTO.MealDto;
import com.mycompany.nutritionplanner_springboot.Entity.Meal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MealMapper {

    MealMapper INSTANCE = Mappers.getMapper(MealMapper.class);

    @Mapping(target = "id", ignore = true)
    Meal mealDtoToMeal(MealDto mealDto);

    MealDto mealToMealDto(Meal meal);
}
