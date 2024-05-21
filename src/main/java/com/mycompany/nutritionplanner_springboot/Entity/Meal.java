package com.mycompany.nutritionplanner_springboot.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "daily_plan_id", nullable = false)
    private DailyPlan dailyPlan;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MealType mealType; // Наприклад, BREAKFAST, LUNCH, DINNER

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private List<Recipe> recipes;

    // Constructors, getters, setters, equals, and hashCode

    public Meal() {}

    public Meal(DailyPlan dailyPlan, MealType mealType) {
        this.dailyPlan = dailyPlan;
        this.mealType = mealType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DailyPlan getDailyPlan() {
        return dailyPlan;
    }

    public void setDailyPlan(DailyPlan dailyPlan) {
        this.dailyPlan = dailyPlan;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
