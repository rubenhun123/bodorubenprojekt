package com.example.bodorubenproject;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = (ShoppingItem.class), version = 1, exportSchema = false)
public abstract class ItemDataBase extends RoomDatabase {

    //private abstract ItemDAO itemDAO;

}
