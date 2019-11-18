package com.example.ck;

import java.util.ArrayList;
import java.util.List;

public class CreateData {

    public static void populateUsers() {

        List<User> dummyUsers = new ArrayList<>();
        dummyUsers.add(new User("Thanos", "password", 120000));
        dummyUsers.add(new User("Spiderman", "password", 55000));
        dummyUsers.add(new User("Hulk", "password", 49000));
        dummyUsers.add(new User("Captain America", "password", 32000));
        dummyUsers.add(new User("Thor", "password", 26800));
        dummyUsers.add(new User("Black Panther", "password", 24600));
        dummyUsers.add(new User("Doctor Strange", "password", 12300));


        SessionData.mUserDatabase.mUserDao().insertMultipleUsers(dummyUsers);
        // Insert if new user
//        for (int i = 0; i < dummyUsers.size(); i++) {
//            if (!currentUsersDatabase.contains(dummyUsers.get(i))){
//                SessionData.mUserDatabase.mUserDao().insertOnlySingleUser(dummyUsers.get(i));
//            }
//        }

    }
}