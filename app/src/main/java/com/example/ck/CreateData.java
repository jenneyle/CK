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

    static List<Question>  preparedQuestions = new ArrayList<>();

    public static void populateQuestions(){

        preparedQuestions.add(new Question("Thor is a what", "superhero", "someone", "ugly fattie", "hottie", "superhero or A", "Easy", false));
        preparedQuestions.add(new Question("whyyyyyyyyyyyy", "please work", "somehting different", "range", "hottie", "xmas lights till jan or A", "Medium", false));
        preparedQuestions.add(new Question("hey pls work", "help me", "somehting different", "range", "hottie", "xmas lights till jan or A", "Medium", false));

        SessionData.mQuestionDatabase.questionDao().insertAllQuestions(preparedQuestions);
    }
}