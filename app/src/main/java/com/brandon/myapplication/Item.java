package com.brandon.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.vision.barcode.Barcode;

/**
 * Created by Brandon on 7/5/2016.
 */
public class Item implements Parcelable , Comparable<Item>{

    private String name;
    private String description;
    private Category category;
    private String barcode;

    protected Item(Parcel in) {
        name = in.readString();
        description = in.readString();
        category = (Category) in.readValue(Category.class.getClassLoader());
        barcode = in.readString();
    }

    public Item(String name, String description, Category category, String barcode) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.barcode = barcode;
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
        dest.writeString(barcode);
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


    @Override
    public int compareTo(Item item) {
        return this.name.compareTo(item.getName());
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
