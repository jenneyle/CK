package com.example.ck;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.ck.Badge;

import java.util.List;

@Dao
public interface BadgeDao {

    @Insert
    void insertSingleSouvenir(Badge souvenir);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertMultipleSouvenir (List<Badge> badgesList);

    @Query("SELECT * FROM Badge WHERE badgeID = :id ")
    Badge fetchSouvenirByID (int id);

    @Query("SELECT * FROM Badge ORDER BY badgeID")
    List<Badge> getAll();

    @Query("SELECT * FROM Badge WHERE badgeID = :id")
    Badge getSingleBadge(int id);


}