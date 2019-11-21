package com.example.ck;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ck.UserSouvenir;

import java.util.List;

@Dao
public interface UserSouvenirDao {
    @Insert
    void insertSingleUserSouvenir(UserSouvenir mUserSouvenir);

    @Insert
    void insertMultipleUserSouvenir(List<UserSouvenir> UserSouvenirList);

    @Query("SELECT * FROM UserSouvenir WHERE souvenirID = :souvenirID ")
    UserSouvenir fetchAllUserSouvenirsByID (int souvenirID);

    @Query("SELECT * FROM UserSouvenir WHERE username = :username  ORDER BY souvenirID")
    List<UserSouvenir> getAllUserSouvenirsByUser(String username);
}
