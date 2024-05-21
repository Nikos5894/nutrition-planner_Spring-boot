package com.mycompany.nutritionplanner_springboot.Mapper;

import com.mycompany.nutritionplanner_springboot.DTO.DailyPlanDto;
import com.mycompany.nutritionplanner_springboot.Entity.DailyPlan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DailyPlanMapper {

    DailyPlanMapper INSTANCE = Mappers.getMapper(DailyPlanMapper.class);

    @Mapping(target = "id", ignore = true)
    DailyPlan dailyPlanDtoToDailyPlan(DailyPlanDto dailyPlanDto);

    DailyPlanDto dailyPlanToDailyPlanDto(DailyPlan dailyPlan);
}
