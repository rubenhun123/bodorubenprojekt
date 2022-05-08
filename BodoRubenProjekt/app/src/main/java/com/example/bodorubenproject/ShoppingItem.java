package com.example.bodorubenproject;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "item_table")
public class ShoppingItem {


    @PrimaryKey
    private String id;

    @ColumnInfo(name="item_info")
    private String info;

    @ColumnInfo(name="item_name")
    private String name;

    @ColumnInfo(name="item_price")
    private String price;

    @ColumnInfo(name="item_rate")
    private Float ratedInfo;

    @ColumnInfo(name="item_resouce")
    private int imageResource;

    @ColumnInfo(name="item_cartedCount")
    private int cartedCount;

    public ShoppingItem() {

    }

    public ShoppingItem(String info, String name, String price, Float ratedInfo, int imageResource, int cartedCount) {
        this.info = info;
        this.name = name;
        this.price = price;
        this.ratedInfo = ratedInfo;
        this.imageResource = imageResource;
        this.cartedCount = cartedCount;
    }




    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Float getRatedInfo() {
        return ratedInfo;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getCartedCount() { return cartedCount; }

    public String _getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

}
