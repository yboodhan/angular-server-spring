package com.angularservertest.angularservertest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

    User() {}

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // standard constructors / setters / getters / toString
}
