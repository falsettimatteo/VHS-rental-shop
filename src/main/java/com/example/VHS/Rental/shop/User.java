package com.example.VHS.Rental.shop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String userId;
    private String userEmail;
    private String userPassword;
    private String role;

    public User() {}
    public User(String id, String email, String password, String role) {
        super();
        this.userId = id;
        this.userEmail = email;
        this.userPassword = password;
        this.role = role;
    }
    public User(String id, String email, String password) {
        super();
        this.userId = id;
        this.userEmail = email;
        this.userPassword = password;
        this.role = "ROLE_USER";
    }

    @Id
    public String getUserId(){
        return userId;
    }
    public void setUserId(String id){
        this.userId = id;
    }

    public String getUserEmail(){
        return userEmail;
    }
    public void setUserEmail(String email){
        this.userEmail = email;
    }

    public String getUserPassword(){
        return userPassword;
    }
    public void setUserPassword(String password){
        this.userPassword = password;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }



}