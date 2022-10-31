package com.example.VHS.Rental.shop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userEmail;
    private String userPassword;
    private String role;

    public User() {}
    public User(String email, String password, String role) {
        super();
        this.userEmail = email;
        this.userPassword = password;
        this.role = role;
    }
    public User( String email, String password) {
        super();
        this.userEmail = email;
        this.userPassword = password;
        this.role = "ROLE_USER";
    }




}