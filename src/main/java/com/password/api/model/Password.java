package com.password.api.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String password_id;
    @NotBlank
    private String password_id_account_website;
    @NotBlank
    private String password_id_account_username;
    @NotBlank
    private String password_id_account_image;
    @NotBlank
    private String password_id_account_password;

    public Password() {
        super();
    }

    public Password(String password_id, String password_id_account_website, String password_id_account_username, String password_id_account_image, String password_id_account_password) {
        this.password_id = password_id;
        this.password_id_account_website = password_id_account_website;
        this.password_id_account_username = password_id_account_username;
        this.password_id_account_image = password_id_account_image;
        this.password_id_account_password = password_id_account_password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "password_id='" + password_id + '\'' +
                ", password_id_account_website='" + password_id_account_website + '\'' +
                ", password_id_account_username='" + password_id_account_username + '\'' +
                ", password_id_account_image='" + password_id_account_image + '\'' +
                ", password_id_account_password='" + password_id_account_password + '\'' +
                '}';
    }
}
