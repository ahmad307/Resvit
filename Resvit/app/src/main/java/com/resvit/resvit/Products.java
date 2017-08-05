package com.resvit.resvit;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by ahmed on 5/8/2017.
 */

public class Products {
    private String Name;
    private String Description;
    private String Category;
    private int Quantity;
    private int Price;
    private int Capacity;

    public String getName(){
        return Name;
    }
    public void setName(String N){
        this.Name = N;
    }

    public String getDescription(){
        return Description;
    }
    public void setDescription(String N){
        this.Description = N;
    }

    public String getCategory(){
        return Category;
    }
    public void setCategory(String N){
        this.Category = N;
    }

    public int getPrice(){
        return Price;
    }
    public void setPrice(int N){
        this.Price = N;
    }

    public int getQuantity(){
        return Quantity;
    }
    public void setQuantity(int N){
        this.Quantity = N;
    }

    public int getCapacity(){
        return Capacity;
    }
    public void setCapacity(int N){
        this.Capacity = N;
    }
}
