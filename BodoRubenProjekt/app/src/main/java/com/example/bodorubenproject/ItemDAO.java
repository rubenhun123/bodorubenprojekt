package com.example.bodorubenproject;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.RoomDatabase;
import androidx.room.Update;

@Dao
public interface ItemDAO {

    @Insert
    Long insertTask(ShoppingItem item);

    @Update
    void updateTask(ShoppingItem item);

    @Delete
    void delete(ShoppingItem item);
}
