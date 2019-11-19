package com.example.ck;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Question.class}, version = 2, exportSchema = false)
public abstract class QuestionDatabase extends RoomDatabase {
    public abstract QuestionDao questionDao();

    private static QuestionDatabase instance;
    public static QuestionDatabase getInstance(Context context){
        if (instance ==  null){
            instance = Room.databaseBuilder(context.getApplicationContext(), QuestionDatabase.class, "questionBD")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }


        }

