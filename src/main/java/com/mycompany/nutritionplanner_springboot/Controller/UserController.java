package com.mycompany.nutritionplanner_springboot.Controller;

import com.mycompany.nutritionplanner_springboot.Entity.User;
import com.mycompany.nutritionplanner_springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Додати інші методи контролера, які вам потрібні
}
