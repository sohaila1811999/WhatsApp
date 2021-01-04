package com.example.tabbed;

public class Contact {




private String name;
private int photo;
private String phone;

    public Contact()
    {}

    public Contact(String name, int photo, String phone) {
        this.name = name;
        this.photo = photo;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getPhone() {
        return phone;
    }
}
