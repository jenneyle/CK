package com.example.ck;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


//one Dao per entity
@Dao
public interface QuestionDao {
    @Insert
    void insert(Question question);

    //@query is for sql query
    @Query("SELECT * FROM Question WHERE pointAllocation = :pointAllocation ")
    List <Question> findQuestionByCategory(int pointAllocation);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertAllQuestions(List<Question> questionList);

    @Query("SELECT * FROM Question")
    List<Question> getAllQuestions();



}