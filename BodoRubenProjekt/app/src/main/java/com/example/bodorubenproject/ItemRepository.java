package com.example.bodorubenproject;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.room.Room;

public class ItemRepository {
    /*private String DB_NAME ="itemdb";

    private ItemDataBase itemDataBase;
    Context context;

    public ItemRepository(Context context) {
        this.context = context;
        itemDataBase = Room.databaseBuilder(context, ItemDataBase.class, DB_NAME).build();

        Toast.makeText(context, "Adatbázis létrehozva.", Toast.LENGTH_LONG).show();
    }

    public void InsertTask(final ShoppingItem item){
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                itemDataBase.itemDAO().insertTask(item);
                return null;
            }
        }.execute();
    }*/

}
