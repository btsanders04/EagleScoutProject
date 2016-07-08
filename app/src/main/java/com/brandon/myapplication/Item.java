package com.brandon.myapplication;

/**
 * Created by Brandon on 7/5/2016.
 */
public class Item {

    private String name;
    private String description;
//    QR ID

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
