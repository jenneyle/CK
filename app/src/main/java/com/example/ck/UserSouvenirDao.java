package com.example.ck;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserSouvenirDao {
    @Insert
    void insertSingleSouvenir(UserSouvenir mUserSouvenir);

    @Insert
    void insertMultipleSouvenirs (List<UserSouvenir> UserSouvenirList);

    @Query("SELECT * FROM UserSouvenir WHERE souvenirID = :souvenirID ")
    UserSouvenir fetchAllSouvenirsByID (int souvenirID);

    @Query("SELECT * FROM UserSouvenir WHERE username = :username  ORDER BY souvenirID")
    List<UserSouvenir> getAllSouvenirsByUser(String username);
}
