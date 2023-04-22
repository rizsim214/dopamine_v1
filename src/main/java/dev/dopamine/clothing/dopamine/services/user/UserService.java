package dev.dopamine.clothing.dopamine.services.user;

import dev.dopamine.clothing.dopamine.models.user.User;

import java.util.List;

public interface UserService {
    User getUserById(Long userId);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Long userId);
}
