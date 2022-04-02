package com.example.isolated.database;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.isolated.User;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface userDAO {
    @Insert
    void insertUser(User user);

    @Query("SELECT * FROM user")
    List<User> getListUser();
}
