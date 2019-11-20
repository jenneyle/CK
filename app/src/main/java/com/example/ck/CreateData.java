package com.example.ck;

import java.util.ArrayList;
import java.util.List;

public class CreateData {


    public static void populateUsers() {

        List<User> dummyUsers = new ArrayList<>();
        dummyUsers.add(new User("Jenny", "123", 30));
        dummyUsers.add(new User("Sophia", "123", 15));
        dummyUsers.add(new User("freeya", "123", 10));


        SessionData.mUserDatabase.mUserDao().insertMultipleUsers(dummyUsers);
        // Insert if new user
//        for (int i = 0; i < dummyUsers.size(); i++) {
//            if (!currentUsersDatabase.contains(dummyUsers.get(i))){
//                SessionData.mUserDatabase.mUserDao().insertOnlySingleUser(dummyUsers.get(i));
//            }
//        }

    }

    static List<Question> preparedQuestions = new ArrayList<>();

    public static void populateQuestions() {

        preparedQuestions.add(new Question("Thor is a what", "superhero", "someone", "ugly fattie", "hottie", "superhero or A", "Easy", false));
        preparedQuestions.add(new Question("whyyyyyyyyyyyy", "please work", "somehting different", "range", "hottie", "xmas lights till jan or A", "Medium", false));
        preparedQuestions.add(new Question("hey pls work", "help me", "somehting different", "range", "hottie", "xmas lights till jan or A", "Medium", false));

        SessionData.mQuestionDatabase.questionDao().insertAllQuestions(preparedQuestions);
    }
    


    public static void populateBadgesDatabase() {
        List<Souvenir> souvenirList = new ArrayList();
        souvenirList.add(new Souvenir(1, "Vegemite", "You're a true shiela", 1));
        souvenirList.add(new Souvenir(2, "Sushi", "Sugoi des ne", 2));
        souvenirList.add(new Souvenir(3, "Baguette", "Oui oui", 3));


        // Insert badges if they are not yet in the database
        // Get the list of badges that are currently in the database
//        List<Badges> currentBadgesDatabase = SessionData.mBadgeDatabase.mBadgeDao().getAll();
//            for (int i = 0; i < badgesList.size(); i++) {
//                if (!currentBadgesDatabase.contains(badgesList.get(i))){
//                    SessionData.mBadgeDatabase.mBadgeDao().insertSingleBadge(badgesList.get(i));
//                }
//            }
        SessionData.mSouvenirDatabase.mSouvenirDao().insertMultipleSouvenir(souvenirList);
    }
}