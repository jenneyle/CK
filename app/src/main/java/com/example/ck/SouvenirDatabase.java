package com.example.ck;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Souvenir.class}, version = 1, exportSchema = false)
public abstract class SouvenirDatabase extends RoomDatabase {
    public abstract SouvenirDao mSouvenirDao();
}
