package com.example.ck;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Question {
    @PrimaryKey
    @NonNull
    private int qid;
    private String question;
    private String imageq;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correctAnswer;
    private int pointAllocation;
    private boolean isImageQuestion;


    public Question(@NonNull int qid, String question, String imageq, String answerA, String answerB, String answerC, String answerD, String correctAnswer, int pointAllocation, boolean isImageQuestion) {
        this.qid = qid;
        this.question = question;
        this.imageq = imageq;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.pointAllocation = pointAllocation;
        this.isImageQuestion = isImageQuestion;
    }
    @Ignore
    public Question(@NonNull int qid, String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer, int pointAllocation, boolean isImageQuestion) {
        this.qid = qid;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.pointAllocation = pointAllocation;
        this.isImageQuestion = isImageQuestion;
    }

    public int getPointAllocation() {
        return pointAllocation;
    }

    public void setPointAllocation(int pointAllocation) {
        this.pointAllocation = pointAllocation;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public void setQuestion(@NonNull String question) {
        this.question = question;
    }

    public String getImageq() {
        return imageq;
    }

    public void setImageq(String imageq) {
        this.imageq = imageq;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setImageQuestion(boolean imageQuestion) {
        isImageQuestion = imageQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isImageQuestion() {
        return isImageQuestion;
    }
}