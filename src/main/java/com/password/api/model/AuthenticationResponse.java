package com.password.api.model;


import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String jwtToken;

    public AuthenticationResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }
}