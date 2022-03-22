package com.password.api.controller;

import com.password.api.model.Password;
import com.password.api.model.User;
import com.password.api.repository.PasswordRepo;
import com.password.api.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/password")
public class PasswordController {
    final
    PasswordRepo passwordRepo;

    @Autowired
    private UserRepo userRepo;

    public PasswordController(PasswordRepo passwordRepo) {
        this.passwordRepo = passwordRepo;
    }


    // Get password for particular user with valid token
    @GetMapping(path = "/getAllPassword")
    public @ResponseBody
    Iterable<Password> getAllPassword() {
        return passwordRepo.findAll();
    }


    @RequestMapping(value = "/getAllPassword", params = {"username"})
    public @ResponseBody
    Iterable<Password> getAllPasswordForUser(@RequestParam("username") String username) {
        ArrayList<Password> tempList = new ArrayList<>();
        if (userRepo.getUserByUsername(username).getUserToken().equals(UserController.token)) {
            for (Password p : passwordRepo.findAll()) {
                if (p.getPassword_id_account_user_token().equals(UserController.token)) {
                    tempList.add(p);
                }
            }
        }
        return tempList;
    }


    User getParams(@RequestParam("username") String username) {
        if (userRepo.getUserByUsername(username).getUserToken().equals(UserController.token)) {
            return userRepo.getUserByUsername(username);
        } else {
            return new User(null, "Not Found", null, null, null, null, null);
        }
    }

    @PostMapping(path = "/addNewPassword")
    public String addNewPassword(@RequestBody Password receivedPassword) {
        passwordRepo.save(receivedPassword);
        return "Password added Successfully";
    }

}
