package com.brandon.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Brandon on 7/5/2016.
 */
public class Item implements Parcelable {

    private String name;
    private String description;
    private Category category;


    protected Item(Parcel in) {
        name = in.readString();
        description = in.readString();
        category = (Category) in.readValue(Category.class.getClassLoader());
    }

    public Item(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeValue(category);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
//    QR ID


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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
