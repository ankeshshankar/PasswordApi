package com.password.api.controller;

import com.password.api.model.User;
import com.password.api.repository.UserRepo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password/user")
public class UserController {
    final
    UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping(path = "/getAllUser")
    public @ResponseBody
    Iterable<User> getAllUser() {
        return userRepo.findAll();
    }

    @PostMapping(path = "/addNewUser")
    public String addNewUser(@RequestBody User newUser) {
        userRepo.save(newUser);
        return "New User Added";
    }
}
