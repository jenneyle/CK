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

    public static void populateUserBadges() {
        // This method will assign the score based badges to all of the dummy data users
        List<User> users = SessionData.mUserDatabase.mUserDao().getAll();
        for (int i = 0; i < users.size(); i++) {
            List<UserSouvenir> currentUserSouvenir = SessionData.mUserSouvenirDatabase.mUserSouvenirDao().getAllUserSouvenirsByUser(users.get(i).getUsername());

            boolean hasIntern = false;
            for (int n = 0; n < currentUserSouvenir.size(); n++) {
                if (currentUserSouvenir.get(n).getSouvenirID() == 1) {
                    hasIntern = true;
                }
            }
            if(hasIntern == false) {
                SessionData.mUserSouvenirDatabase.mUserSouvenirDao().insertSingleUserSouvenir(new UserSouvenir(users.get(i).getUsername(), 1));
            }


            if (users.get(i).getScore() >= 1000) {
                boolean hasGraduate = false;
                for (int n = 0; n < currentUserSouvenir.size(); n++) {
                    if (currentUserSouvenir.get(n).getSouvenirID() == 2) {
                        hasGraduate = true;
                    }
                }
                if(hasGraduate == false) {
                    SessionData.mUserSouvenirDatabase.mUserSouvenirDao().insertSingleUserSouvenir(new UserSouvenir(users.get(i).getUsername(), 2));
                }
            }


            if (users.get(i).getScore() >= 5000) {
                boolean hasSenior = false;
                for (int n = 0; n < currentUserSouvenir.size(); n++) {
                    if (currentUserSouvenir.get(n).getSouvenirID() == 3) {
                        hasSenior = true;
                    }
                }
                if(hasSenior == false) {
                    SessionData.mUserSouvenirDatabase.mUserSouvenirDao().insertSingleUserSouvenir(new UserSouvenir(users.get(i).getUsername(), 3));
                }
            }

        }
    }

    static List<Question> preparedQuestions = new ArrayList<>();

    public static void populateQuestions() {

        preparedQuestions.add(new Question("Thor is a what", "superhero", "someone", "ugly fattie", "hottie", "A", "Easy", false));
        preparedQuestions.add(new Question("whyyyyyyyyyyyy", "please work", "somehting different", "range", "hottie", "B", "Medium", false));
        preparedQuestions.add(new Question("hey pls work", "help me", "somehting different", "range", "hottie", "C", "Medium", false));

        SessionData.mQuestionDatabase.mQuestionDao().insertAllQuestions(preparedQuestions);
    }


//
    public static void populateSouvenirDatabase() {
        List<Souvenir> souvenirList = new ArrayList();
        souvenirList.add(new Souvenir(1, "Vegemite", "You're a true shiela", 1, 10));
        souvenirList.add(new Souvenir(2, "Sushi", "Sugoi des ne", 2, 20));
        souvenirList.add(new Souvenir(3, "Baguette", "Oui oui", 3, 30));


        // Insert badges if they are not yet in the database
        // Get the list of badges that are currently in the database
//        List<Badges> currentBadgesDatabase = SessionData.mBadgeDatabase.mBadgeDao().getAll();
//            for (int i = 0; i < badgesList.size(); i++) {
//                if (!currentBadgesDatabase.contains(badgesList.get(i))){
//                    SessionData.mBadgeDatabase.mBadgeDao().insertSingleBadge(badgesList.get(i));
//                }
//            }

        //may need this later remember
        SessionData.mSouvenirDatabase.mSouvenirDao().insertMultipleSouvenir(souvenirList);
    }
}