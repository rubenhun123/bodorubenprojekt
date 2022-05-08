package com.example.bodorubenproject;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ShopRepository {
    //private ShopDao dao;
//    private LiveData<List<ShoppingItem>> items;
//
//    ShopRepository(Application application) {
//        ShopRoomDatabase db = ShopRoomDatabase.getinstance(application);
//        //dao = db.shopDAO();
//        //items = dao.getItems();
//    }
//
//    public LiveData<List<ShoppingItem>> getAllItems() {
//        return items;
//    }
//
//    public void insert(ShoppingItem item) {
//        new Insert(this.dao).execute(items);
//    }
//
//    private static class Insert extends AsyncTask<ShoppingItem, Void, Void> {
//        private shopDAO mDAO;
//
//        Insert(shopDAO dao) {
//            this.mDAO = dao;
//        }
//
//
//        @Override
//        protected Void doInBackground(ShoppingItem... shoppingItems) {
//            mDAO.insert(items[0]);
//            return null;
//        }
//    }
}
