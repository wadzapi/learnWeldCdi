package org.wadzapi.authentication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {
    @Id
    private String username;
    private String name;
    private String password;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "users (username = " + username + ", name = " + name + ")";
    }

}
