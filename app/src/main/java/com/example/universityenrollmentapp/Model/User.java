package com.example.universityenrollmentapp.Model;

import java.util.UUID;

public class User {
    private final String id;
    private String name;
    private String email;
    private String password;

    // Constructor
    public User(String name, String email, String password) {
        this.id = UUID.randomUUID().toString(); // Auto-generate unique ID
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
