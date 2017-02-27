package com.recepcoban.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@Entity(name = "demo_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String role;

    public User() {
    }

    public User(Long id, String firstname, String lastname, String role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
