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
    private LinkedList<String> reviews;
    private String name;
    private String cateogry;
    private String about;
    private double rating;
    private Location location;

    public Business(){
        TotalNumber++;
    }

    public Business(String name, String cateogry, String about, double rating){
        this.name = name;
        this.cateogry = cateogry;
        this.about = about;
        this.rating = rating;
        TotalNumber++;
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

    public void setCateogry(String cateogry){
        this.cateogry = cateogry;
    }

    public String getCateogry(){
        return  cateogry;
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

    public void setLocation(Location location){
        this.location = location;
    }

    public Location getLocation(){
        return location;
    }
}
