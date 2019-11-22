package com.example.ck;

import java.util.ArrayList;
import java.util.List;

public class CreateData {
    public static void populateUsers() {

        List<User> dummyUsers = new ArrayList<>();
        dummyUsers.add(new User("Jenny", "123", 250));
        dummyUsers.add(new User("Sophia", "123", 150));
        dummyUsers.add(new User("freeya", "123", 10));
        SessionData.mUserDatabase.mUserDao().insertMultipleUsers(dummyUsers);

    }

    static List<Question> preparedQuestions = new ArrayList<>();

    public static void populateQuestions() {

        preparedQuestions.add(new Question(1, "What continent is Belgium in?", "Europe", "North America", "Africa", "Antarctica", "Europe", 10, false));
        preparedQuestions.add(new Question(2, "What continent is Indonesia in?", "Antarctica", "South America", "Asia", "Australia", "Asia", 10, false));
        preparedQuestions.add(new Question(3, "What continent is Mexico in?", "North America", "Asia", "South America", "Europe", "South America", 10, false));
        preparedQuestions.add(new Question(4, "What continent is Nigeria in?", "Africa", "Asia", "South America", "Australia", "Africa", 10, false));
        preparedQuestions.add(new Question(5, "What is the capital city of France", "Paris", "Rome", "Amsterdam", "London", "Paris", 10, false));
        preparedQuestions.add(new Question(6, "What is the capital city of Japan", "Seoul", "Tokyo", "Hanoi", "Beijing", "Tokyo", 10, false));
        preparedQuestions.add(new Question(7, "What country has the following flag?", "https://www.countryflags.io/CN/flat/64.png", "Turkey", "South Korea", "China", "Iran", "China", 10, true));
        preparedQuestions.add(new Question(8, "What country has the following flag?", "https://www.countryflags.io/CA/flat/64.png", "Canada", "United States", "Mexico", "Taiwan", "Canada", 10, true));

        preparedQuestions.add(new Question(9, "What continent is Peru in?", "South America", "North America", "Asia", "Europe", "South America", 20, false));
        preparedQuestions.add(new Question(10,"What continent is Lebanon in?", "Australia", "Asia", "South America", "Europe", "Asia", 20, false));
        preparedQuestions.add(new Question(11,"What is the capital city of Malaysia", "Bangkok", "Tokyo", "Kuala Lumpur", "Beijing", "Kuala Lumpur", 20, false));
        preparedQuestions.add(new Question(12,"What is the capital city of the United States", "New York", "Los Angeles", "Dallas", "Washington DC", "Washington DC", 20, false));
        preparedQuestions.add(new Question(13, "What is the capital city of Hawaii", "Waikiki", "Aiea", "Honolulu", "Bora Bora", "Honolulu", 20, false));
        preparedQuestions.add(new Question(14, "What country has the following flag?", "https://www.countryflags.io/AR/flat/64.png", "Argentina", "Denmark", "Crotia", "Italy", "Argentina", 20, true));
        preparedQuestions.add(new Question(15, "What country has the following flag?", "https://www.countryflags.io/RU/flat/64.png", "Canada", "Russia", "Iceland", "Turkey", "Russia", 20, true));


        preparedQuestions.add(new Question(16,"What continent is Egypt in?", "South America", "Asia", "Europe", "Africa", "Africa", 30, false));
        preparedQuestions.add(new Question(17,"What continent is Estonia in?", "Australia", "Asia", "South America", "Europe", "Europe", 30, false));
        preparedQuestions.add(new Question(18,"What is the capital city of Khzakhstan", "Astana", "Jamestown", "Hanoi", "El Aioun", "Astana", 30, false));
        preparedQuestions.add(new Question(19,"What is the capital city of Myanmar", "Castries", "Naypyidaw", "Dakar", "Sofia", "Naypyidaw", 30, false));
        preparedQuestions.add(new Question(20,"What is the capital city of Haiti", "Male", "Port-au-Prince", "Minsk", "Port-a-Pine", "Port-au-Prince", 30, false));
        preparedQuestions.add(new Question(21,"What is the capital city of Hawaii", "Waikiki", "Aiea", "Honolulu", "Bora Bora", "Honolulu", 30, false));
        preparedQuestions.add(new Question(22,"What country has the following flag?", "https://www.countryflags.io/LI/flat/64.png", "Liechtenstein", "Peru", "Crotia", "Qatar", "Liechtenstein", 30, true));
        preparedQuestions.add(new Question(23,"What country has the following flag?", "https://www.countryflags.io/QA/flat/64.png", "Monaco", "Qatar", "Mexico", "Panama", "Qatar", 30, true));
        preparedQuestions.add(new Question(24,"What country has the following flag?", "https://www.countryflags.io/TD/flat/64.png", "Benin", "Chad", "Guinea", "Singapore", "Chad", 30, true));

        SessionData.mUserDatabase.mQuestionDao().insertAllQuestions(preparedQuestions);
    }


    public static void populateSouvenirTable() {
        List<Badge> badgeList = new ArrayList();
        badgeList.add(new Badge(1, "Nomad", "Keep travelling to find fresh pasture!", R.drawable.map));
        badgeList.add(new Badge(2, "Hiker", "You must be a pro at starting fires!", R.drawable.bonfire));
        badgeList.add(new Badge(3, "Backpacker", "Pack your things! Time for an adventure in Asia!", R.drawable.backpack));
        badgeList.add(new Badge(4, "Tourist", "You must have seen the world!", R.drawable.camera));
        badgeList.add(new Badge(5, "Voyager", "You must have seen where the line meets the sea!", R.drawable.ship));
        badgeList.add(new Badge(6, "Pilot", "You are flying between countires now!", R.drawable.hat));
        badgeList.add(new Badge(7, "King of Countries", "You are officially the King of Countires! ", R.drawable.crowns));

        SessionData.mUserDatabase.mBadgeDao().insertMultipleSouvenir(badgeList);
    }
}