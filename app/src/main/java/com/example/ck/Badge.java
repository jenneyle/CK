package com.example.ck;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Badge {
    @PrimaryKey
    private int badgeID;
    private String name;
    private String description;
    private int icon;

    public Badge(int badgeID, String name, String description, int icon) {
        this.badgeID = badgeID;
        this.name = name;
        this.description = description;
        this.icon = icon;

    }

    public int getBadgeID() {
        return badgeID;
    }

    public void setBadgeID(int badgeID) {
        this.badgeID = badgeID;
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