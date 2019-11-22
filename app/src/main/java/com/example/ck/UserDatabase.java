package com.example.ck;

import androidx.room.Database;
import androidx.room.RoomDatabase;



@Database(entities = {User.class, Question.class, Badge.class, Country.class}, version = 10, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao mUserDao();
    public abstract QuestionDao mQuestionDao();
    public abstract BadgeDao mBadgeDao();
    public abstract CountryDao mCountryDao();


}