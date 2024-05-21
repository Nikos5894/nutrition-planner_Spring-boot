package com.mycompany.nutritionplanner_springboot.Service;

import com.mycompany.nutritionplanner_springboot.DAO.UserRepository;
import com.mycompany.nutritionplanner_springboot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

 public void save(User user) {
    userRepository.save(user);
}

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    // Додати інші методи для реалізації бізнес-логіки, які вам потрібні
}
