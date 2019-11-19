package com.example.ck;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


//one Dao per entity
@Dao
public interface QuestionDao {
    @Insert
    void insert(Question question);

    //@query is for sql query
    @Query("SELECT * FROM Question WHERE categoryID = :categoryID ")
    Question findQuestionByCategory (String categoryID);

    @Query("SELECT * FROM Question")
    List<Question> getAllQuestions();



}
