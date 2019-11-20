package com.example.ck;

import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

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
