package com.password.api.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "password")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

public class Password {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "password_id")
    private String password_id;
    @NotBlank
    private String password_id_account_website;
    @NotBlank
    private String password_id_account_username;
    @NotBlank
    private String password_id_account_image;
    @NotBlank
    private String password_id_account_password;
    @NotBlank
    private String password_id_account_user_token;

    public Password() {
        super();
    }

    public Password(String password_id, String password_id_account_website, String password_id_account_username, String password_id_account_image, String password_id_account_password, String password_id_account_user_token) {
        this.password_id = password_id;
        this.password_id_account_website = password_id_account_website;
        this.password_id_account_username = password_id_account_username;
        this.password_id_account_image = password_id_account_image;
        this.password_id_account_password = password_id_account_password;
        this.password_id_account_user_token = password_id_account_user_token;
    }

    public String getPassword_id() {
        return password_id;
    }

    public void setPassword_id(String password_id) {
        this.password_id = password_id;
    }

    public String getPassword_id_account_website() {
        return password_id_account_website;
    }

    public void setPassword_id_account_website(String password_id_account_website) {
        this.password_id_account_website = password_id_account_website;
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

    public String getPassword_id_account_password() {
        return password_id_account_password;
    }

    public void setPassword_id_account_password(String password_id_account_password) {
        this.password_id_account_password = password_id_account_password;
    }

    public String getPassword_id_account_user_token() {
        return password_id_account_user_token;
    }

    public void setPassword_id_account_user_token(String password_id_account_user_token) {
        this.password_id_account_user_token = password_id_account_user_token;
    }

    @Override
    public String toString() {
        return "Password{" +
                "password_id='" + password_id + '\'' +
                ", password_id_account_website='" + password_id_account_website + '\'' +
                ", password_id_account_username='" + password_id_account_username + '\'' +
                ", password_id_account_image='" + password_id_account_image + '\'' +
                ", password_id_account_password='" + password_id_account_password + '\'' +
                ", password_id_account_user_token='" + password_id_account_user_token + '\'' +
                '}';
    }
}
