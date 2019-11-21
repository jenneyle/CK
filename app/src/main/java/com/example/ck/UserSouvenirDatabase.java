//package com.example.ck;
//
//import android.content.Context;
//
//import androidx.room.Database;
//import androidx.room.Room;
//import androidx.room.RoomDatabase;
//
//@Database(entities = {UserSouvenir.class}, version = 1, exportSchema = false)
//public abstract class UserSouvenirDatabase extends RoomDatabase {
//    public abstract UserSouvenirDao mUserSouvenirDao() ;
//
//    private static UserSouvenirDatabase instance;
//    public static UserSouvenirDatabase getInstance(Context context){
//        if (instance ==  null){
//            instance = Room.databaseBuilder(context.getApplicationContext(), UserSouvenirDatabase.class, "userSouvenirBD")
//                    .fallbackToDestructiveMigration()
//                    .allowMainThreadQueries()
//                    .build();
//        }
//        return instance;
//    }
//
//
//}


