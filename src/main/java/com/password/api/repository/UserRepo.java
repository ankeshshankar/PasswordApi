package com.password.api.repository;

import com.password.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User getUserByUsername(String userName);
}