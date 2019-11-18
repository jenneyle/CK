package com.example.ck;

import java.util.ArrayList;

public class QuestionBank {
    public static String difficulty;

    public QuestionBank(String difficulty) {
        this.difficulty = difficulty;

    }
    public static String[] categories = {
            "Easy",
            "Medium",
            "Hard"
    };

    public static int getScore(String difficulty) {
        // Returns the score value of the questions
        switch (difficulty) {
            case "Easy":
                return 10;
            case "Medium":
                return 20;
            case "Hard":
                return 30;
        }
        return 0;
    }

    public static ArrayList<String> getSentenceBank(String category) {
        ArrayList<String> sentenceList = new ArrayList<>();
        switch (difficulty) {
            case "Easy":
                sentenceList.add("What continent is this country from?");
                sentenceList.add("The engines had twin overhead camshafts which were gear driven via a train of gears coming from the rear of the crankshaft");
                break;
            case "Medium":
                sentenceList.add("What currency does this country use?");
                sentenceList.add("There were pigs and goats on the island, and plenty of fish could be caught from ashore");
                break;
            case "Hard":
                sentenceList.add("What is the calling code of this region?");
                sentenceList.add("And Natasha felt that this costume, the very one she had regarded w");
                break;
        }
        return sentenceList;
    }


}
