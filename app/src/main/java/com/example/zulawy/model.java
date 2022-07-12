package com.example.zulawy;

public class model {
 String name, tresc, image;

   model() {

    }

    public model(String name, String tresc, String image) {
        this.name = name;
        this.tresc = tresc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
