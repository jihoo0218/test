package com.example.demo.form;

import lombok.Data;

@Data
public class LoginForm {
    private String id;
    private String password;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
