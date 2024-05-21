package com.mycompany.nutritionplanner_springboot.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String role;

    private String firstName;
    private String lastName;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Double weight;
    private Double height;

    @Enumerated(EnumType.STRING)
    private PhysicalActivityLevel physicalActivityLevel;

    @Enumerated(EnumType.STRING)
    private Goals goals;

    @Enumerated(EnumType.STRING)
    private DietaryPreferences dietaryPreferences;

    private String allergies;

    // Constructors, getters, and setters

    public User() {}

    public User(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    // Getters and setters

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Additional methods if needed
}
