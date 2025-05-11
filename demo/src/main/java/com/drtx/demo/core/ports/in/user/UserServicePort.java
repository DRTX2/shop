package com.drtx.demo.core.ports.in.user;

import com.drtx.demo.core.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserServicePort {
    User createUser(User user);
    Optional<User> findUserById(Long id);
    List<User> findAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
}
