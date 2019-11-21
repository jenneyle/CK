//package com.example.ck;
//
//import android.content.Context;
//
//import androidx.room.Database;
//import androidx.room.Room;
//import androidx.room.RoomDatabase;
//
//@Database(entities = {Souvenir.class}, version = 1, exportSchema = false)
//public abstract class SouvenirDatabase extends RoomDatabase {
//    public abstract SouvenirDao mSouvenirDao();
//
//    private static SouvenirDatabase instance;
//    public static SouvenirDatabase getInstance(Context context){
//        if (instance ==  null){
//            instance = Room.databaseBuilder(context.getApplicationContext(), SouvenirDatabase.class, "souvenirBD")
//                    .fallbackToDestructiveMigration()
//                    .allowMainThreadQueries()
//                    .build();
//        }
//        return instance;
//}
//    }
