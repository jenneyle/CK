package com.example.ck;

import android.content.Context;

import androidx.room.Room;

public class SessionData {

    public static UserDatabase mUserDatabase;
    public static QuestionDatabase mQuestionDatabase;
    public static SouvenirDatabase mSouvenirDatabase;
    public static User currentUser = new User("Kevin", "password", 1);


    public static void createDB(Context context) {

        mUserDatabase = Room.databaseBuilder(context.getApplicationContext(),
                UserDatabase.class, "user_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        mQuestionDatabase = Room.databaseBuilder(context.getApplicationContext(),
                QuestionDatabase.class, "q_db").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }
}