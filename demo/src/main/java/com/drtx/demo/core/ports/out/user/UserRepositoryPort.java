package com.drtx.demo.core.ports.out.user;

import com.drtx.demo.core.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    User update(User user);
    void deleteById(Long id);
}
