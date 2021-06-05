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
    public @ResponseBody
    String addNewPassword(@RequestParam String password_id_account_username, @RequestParam String password_id_account_image, @RequestParam String getPassword_id_account_password) {

        Password newPassword = new Password();
        newPassword.setPassword_id(0);
        newPassword.setPassword_id_account_username(password_id_account_username);
        newPassword.setPassword_id_account_image(password_id_account_image);
        newPassword.setGetPassword_id_account_password(getPassword_id_account_password);
        passwordRepo.save(newPassword);
        return "Password added Successfully";
    }

}
