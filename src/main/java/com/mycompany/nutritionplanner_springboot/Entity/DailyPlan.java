package com.mycompany.nutritionplanner_springboot.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "daily_plans")
public class DailyPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "diet_plan_id", nullable = false)
    private DietPlan dietPlan;

    @Column(nullable = false)
    private LocalDate date;

    @OneToMany(mappedBy = "dailyPlan", cascade = CascadeType.ALL)
    private List<Meal> meals;

    // Constructors, getters, setters, equals, and hashCode

    public DailyPlan() {}

    public DailyPlan(DietPlan dietPlan, LocalDate date) {
        this.dietPlan = dietPlan;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyPlan dailyPlan = (DailyPlan) o;
        return Objects.equals(id, dailyPlan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
