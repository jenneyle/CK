package com.example.ck;

import android.content.Context;

import androidx.room.Room;

public class SessionData {

    public static UserDatabase mUserDatabase;
    public static UserDatabase mQuestionDatabase;
    //public static QuestionDatabase mQuestionDatabase;
    public static UserDatabase mSouvenirDatabase;
    public static UserDatabase mUserSouvenirDatabase;
    public static User currentUser = new User("Kevin", "password", 1);


    public static void createDB(Context context) {

        mUserDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        mQuestionDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        mSouvenirDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        mUserSouvenirDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }
}