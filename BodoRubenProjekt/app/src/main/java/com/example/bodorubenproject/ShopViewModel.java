package com.example.bodorubenproject;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

//public class ShopViewModel extends AndroidViewModel {
//    private ShopRepository repository;
//    private LiveData<List<ShoppingItem>> items;
//
//    public ShopViewModel(Application application) {
//        super(application);
//        this.repository = new ShopRepository(application);
//        this.items = repository.getAllItems();
//
//    }
//
//    public LiveData<List<ShoppingItem>> getallItems() {
//        return this.items;
//    }
//
//    public void insert(ShoppingItem item){
//        this.repository.insert(item);
//    }
//
//}
