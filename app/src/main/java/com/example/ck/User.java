package com.example.ck;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class User {
    @NonNull
    @PrimaryKey
    String username;

    String password;

    int score;

    public User(String username, String password, int score) {
        this.username = username;
        this.password = password;
        this.score = score;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return
                "Users{" +
                        ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", score=" + score +
                        '}';
    }
}