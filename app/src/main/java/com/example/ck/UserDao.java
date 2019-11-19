package com.example.ck;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void insertOnlySingleUser (User user);

    @Insert
    void insertAll(User... users);

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    //void insertAll(List<User> userList);
    void insertMultipleUsers (List<User> usersList);


    @Query("SELECT * FROM User WHERE username = :userName")
    User fetchOneUserByUserName (String userName);

    @Query("SELECT * FROM User ORDER BY score DESC")
    List<User> getAllScore();

    @Query("UPDATE USER SET score = score + :addNum WHERE username = :userName")
    void updateScore (int addNum, String userName);

    @Query("UPDATE USER SET password = :password WHERE username = :userName")
    void updatePassword (String password, String userName);

    @Insert
    void insertNewUser (User user);


    @Update
    void updateUser (User user);

    @Delete
    void deleteUser (User user);

}