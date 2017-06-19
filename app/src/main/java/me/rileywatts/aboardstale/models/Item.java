package me.rileywatts.aboardstale.models;

import org.parceler.Parcel;

/**
 * Created by Guest on 6/19/17.
 */

@Parcel
public class Item {
    String description;
    Boolean sword;
    Boolean wings;
    Boolean food;

    public Item() {}

    public Item(String description) {
        this.description = description;
        this.sword = false;
        this.wings = false;
        this.food = false;
    }
}
