package com.example.ck;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CountryDao {
    @Query("SELECT * FROM Country")
    List<Country> getAll();
}
