package com.resvit.resvit;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Network;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Business {
    public static int TotalNumber = 0;
    private static LinkedList<Business> allItems;
    private LinkedList<String> reviews;
    private String name;
    private String category;
    private String about;
    private double rating;
    private String location;
    private String website;
    private String number;
    private LinkedList<Products> items;
    public Business(){
        TotalNumber++;
    }

    public Business(String name, String location, String number, String website, String about, String category){
        this.name = name;
        this.location = location;
        this.number = number;
        this.website = website;
        this.about = about;
        this.category = category;
        TotalNumber++;
        allItems.add(this);
    }

    public void setReviews(String review){
        reviews.add(review);
    }

    public LinkedList<String> getReviews(){
        return  reviews;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setCategory(String cateogry){
        this.category = cateogry;
    }

    public String getCategory(){
        return  category;
    }

    public void setAbout(String about){
        this.about = about;
    }

    public String getAbout(){
        return about;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(){
        return rating;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setWebsite(String website){this.website = website;}

    public String getWebsite(){return website;}

    public void setNumber(String number){this.number = number;}

    public String getNumber(){return number;}

    public void setItems(Products product){items.add(product);}

    public LinkedList<Products> getItems(){return items;}
}
