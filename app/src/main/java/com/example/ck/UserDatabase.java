package com.example.ck;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;



@Database(entities = {User.class, Question.class}, version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao mUserDao();

    private static UserDatabase instance;
    public static UserDatabase getInstance(Context context){
        if (instance ==  null){
            instance = Room.databaseBuilder(context.getApplicationContext(), UserDatabase.class, "ckBD")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()   // <== IMPORTANT TO NOTE:
                    //     This is NOT correct to do in a completed app.
                    //     Next week we will fix it, but for now this
                    //     line is necessary for the app to work.
                    //     This line will basically allow the database
                    //     queries to freeze the app.
                    .build();
        }
        return instance;
    }

    public static void destroyInstance(){
        instance = null;
    }
}




