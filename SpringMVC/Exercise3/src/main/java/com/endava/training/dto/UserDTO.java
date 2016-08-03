package com.endava.training.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ivamesu on 8/2/2016.
 */

public class UserDTO {

    private Integer id;

    @NotNull
    @Size(min=1,max=40)
    @Column(unique=true)
    private String username;

    @NotNull
    @Size(min=1,max=40)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
