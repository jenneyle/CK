package com.example.ck;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;

@Entity (primaryKeys = {"username", "souvenirID"})
public class UserSouvenir {
    @NonNull private String username;
    @NonNull private int souvenirID;



    public UserSouvenir(@NonNull String username, int souvenirID) {
        this.username = username;
        this.souvenirID = souvenirID;
    }
    @Ignore
    public UserSouvenir(){}

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public int getSouvenirID() {
        return souvenirID;
    }

    public void setSouvenirID(int souvenirID) {
        this.souvenirID = souvenirID;
    }
}
