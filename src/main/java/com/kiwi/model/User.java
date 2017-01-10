package com.kiwi.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by malithi on 1/2/17.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String userPassWord;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassWord + '\'' +
                '}';
    }
}
