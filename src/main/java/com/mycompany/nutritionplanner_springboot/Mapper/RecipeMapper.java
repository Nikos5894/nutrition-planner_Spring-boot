package com.mycompany.nutritionplanner_springboot.Mapper;

import com.mycompany.nutritionplanner_springboot.DTO.RecipeDto;
import com.mycompany.nutritionplanner_springboot.Entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {

    RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    @Mapping(target = "id", ignore = true)
    Recipe recipeDtoToRecipe(RecipeDto recipeDto);

    RecipeDto recipeToRecipeDto(Recipe recipe);
}
