package com.mycompany.nutritionplanner_springboot.Mapper;

import com.mycompany.nutritionplanner_springboot.DTO.DietPlanDto;
import com.mycompany.nutritionplanner_springboot.Entity.DietPlan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DietPlanMapper {

    DietPlanMapper INSTANCE = Mappers.getMapper(DietPlanMapper.class);

    @Mapping(target = "id", ignore = true)
    DietPlan dietPlanDtoToDietPlan(DietPlanDto dietPlanDto);

    DietPlanDto dietPlanToDietPlanDto(DietPlan dietPlan);
}
