package com.example.ck;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserSouvenirDatabase.class}, version = 1, exportSchema = false)
public abstract class UserSouvenirDatabase extends RoomDatabase {
    public abstract UserSouvenirDao mUsrBadgesDao() ;
}


