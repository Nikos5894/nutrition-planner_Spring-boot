package com.mycompany.nutritionplanner_springboot.Mapper;

import com.mycompany.nutritionplanner_springboot.DTO.IngredientDto;
import com.mycompany.nutritionplanner_springboot.Entity.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper {

    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

    @Mapping(target = "id", ignore = true)
    Ingredient ingredientDtoToIngredient(IngredientDto ingredientDto);

    IngredientDto ingredientToIngredientDto(Ingredient ingredient);
}
