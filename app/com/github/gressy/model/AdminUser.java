package com.github.gressy.model;

import com.github.gressy.entities.model.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class AdminUser extends User {

    public String getRole() {
        return "admin";
    }

    // Add some interesting fields here

}
