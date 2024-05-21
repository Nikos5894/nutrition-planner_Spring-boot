package com.mycompany.nutritionplanner_springboot.DAO;

import com.mycompany.nutritionplanner_springboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
    // Методи для взаємодії з базою даних будуть автоматично створені
}
