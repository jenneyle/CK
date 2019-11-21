package com.example.ck;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.ck.Souvenir;

import java.util.List;

@Dao
public interface SouvenirDao {

    @Insert
    void insertSingleSouvenir(Souvenir souvenir);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertMultipleSouvenir (List<Souvenir> badgesList);

    @Query("SELECT * FROM Souvenir WHERE souvenirID = :id ")
    Souvenir fetchSouvenirByID (int id);

    @Query("SELECT * FROM Souvenir ORDER BY souvenirID")
    List<Souvenir> getAll();


}
