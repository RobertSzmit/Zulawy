package com.example.firebasecard;

public class Messages {

    // Model class
    String name;
    String imageUrl;

    // Constructors

    public Messages() {
    }

    public Messages(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
