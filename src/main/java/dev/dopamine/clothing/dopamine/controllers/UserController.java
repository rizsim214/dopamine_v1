package dev.dopamine.clothing.dopamine.controllers;

import dev.dopamine.clothing.dopamine.models.user.User;
import dev.dopamine.clothing.dopamine.services.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userServiceImpl.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUser() {
        return userServiceImpl.getAllUsers();
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userServiceImpl.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userServiceImpl.deleteUserById(id);
    }

}
