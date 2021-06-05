package com.password.api.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Password")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int password_id;
    @NotBlank
    private String password_id_account_username;
    @NotBlank
    private String password_id_account_image;
    @NotBlank
    private String getPassword_id_account_password;

    public Password() {
        super();
    }

    public Password(int password_id, String password_id_account_username, String password_id_account_image, String getPassword_id_account_password) {
        this.password_id = password_id;
        this.password_id_account_username = password_id_account_username;
        this.password_id_account_image = password_id_account_image;
        this.getPassword_id_account_password = getPassword_id_account_password;
    }

    public int getPassword_id() {
        return password_id;
    }

    public void setPassword_id(int password_id) {
        this.password_id = password_id;
    }

    public String getPassword_id_account_username() {
        return password_id_account_username;
    }

    public void setPassword_id_account_username(String password_id_account_username) {
        this.password_id_account_username = password_id_account_username;
    }

    public String getPassword_id_account_image() {
        return password_id_account_image;
    }

    public void setPassword_id_account_image(String password_id_account_image) {
        this.password_id_account_image = password_id_account_image;
    }

    public String getGetPassword_id_account_password() {
        return getPassword_id_account_password;
    }

    public void setGetPassword_id_account_password(String getPassword_id_account_password) {
        this.getPassword_id_account_password = getPassword_id_account_password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "password_id=" + password_id +
                ", password_id_account_username='" + password_id_account_username + '\'' +
                ", password_id_account_image='" + password_id_account_image + '\'' +
                ", getPassword_id_account_password='" + getPassword_id_account_password + '\'' +
                '}';
    }
}
