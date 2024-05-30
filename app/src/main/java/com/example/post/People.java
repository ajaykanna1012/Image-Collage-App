package com.example.post;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class People {
    private String title;
    private String description;
    Bitmap image;
ArrayList<String> bitmaps;



    public People(String title, String description,ArrayList<String> bitmaps) {
        this.title = title;
        this.description = description;
//       this.image= image;
        this.bitmaps = bitmaps;

    }

    public ArrayList<String> getBitmaps() {
        return bitmaps;
    }

    public void setBitmaps(ArrayList<String> bitmaps) {
        this.bitmaps = bitmaps;
    }

    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
