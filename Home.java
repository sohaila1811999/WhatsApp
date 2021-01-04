package com.example.tabbed;

public class Home {




private String name;
private int photo;
private String text;

    public Home()
    {}

    public Home(String name, int photo, String text) {
        this.name = name;
        this.photo = photo;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String gettext() {
        return text;
    }
}
