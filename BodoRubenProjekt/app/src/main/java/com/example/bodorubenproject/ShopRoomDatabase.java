package com.example.bodorubenproject;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {ShoppingItem.class}, version = 1, exportSchema = false)
public abstract class ShopRoomDatabase extends RoomDatabase{

    //public abstract ShoppingItemDAO shoppingItemDAO();

//    private static ShopRoomDatabase instance;
//
//    public static ShopRoomDatabase getinstance(Context context) {
//        if(instance == null){
//            synchronized (ShopRoomDatabase.class) {
//                if (instance == null) {
//                    instance = Room.databaseBuilder(context.getApplicationContext(), ShopRoomDatabase.class, name: "shop_database").fallbackToDestructiveMigration().build();
//                }
//            }
//        }
//        return instance;
//    }
//
//    private static RoomDatabase.Callback populationCallback = new RoomDatabase.Callback() {
//        public void onOpen(@NonNull SupportSQLiteDatabase db) {
//
//        }
//    };
//
//    private static class InitDb extends AsyncTask<Void, Void, Void> {
//        private shopDAO dao;
//        String[] items = {"a", "b"};
//        InitDb(ShopRoomDatabase db){
//            this.dao = db.shopDAO();
//        }
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//            this.dao.deleteAll();
//
//            for(int i = 0; i< items.length; i++){
//                this.dao.insert(new ShoppingItem(items[i]));
//            }
//
//            return null;
//        }
//    }
}
