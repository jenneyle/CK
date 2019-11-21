package com.example.ck;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Souvenir {
    @PrimaryKey
    private int souvenirID;
    private String name;
    private String description;
    private int icon;

    public Souvenir(int souvenirID, String name, String description, int icon) {
        this.souvenirID = souvenirID;
        this.name = name;
        this.description = description;
        this.icon = icon;

    }

    public int getSouvenirID() {
        return souvenirID;
    }

    public void setSouvenirID(int souvenirID) {
        this.souvenirID = souvenirID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }


}
