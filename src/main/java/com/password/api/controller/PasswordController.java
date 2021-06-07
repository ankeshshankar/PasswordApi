package com.password.api.controller;

import com.password.api.model.Password;
import com.password.api.repository.PasswordRepo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password")
public class PasswordController {
    final
    PasswordRepo passwordRepo;

    public PasswordController(PasswordRepo passwordRepo) {
        this.passwordRepo = passwordRepo;
    }

    @GetMapping(path = "/getAllPassword")
    public @ResponseBody
    Iterable<Password> getAllPassword() {
        return passwordRepo.findAll();
    }

    @PostMapping(path = "/addNewPassword")
    public String addNewPassword(@RequestBody Password receivedPassword) {
        passwordRepo.save(receivedPassword);
        return "Password added Successfully";
    }

}
