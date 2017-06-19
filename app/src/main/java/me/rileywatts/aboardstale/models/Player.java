package me.rileywatts.aboardstale.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 6/19/17.
 */

@Parcel
public class Player {

    String name;
    Integer health;
    Boolean sword;
    Boolean wings;
    Boolean key;

    public Player() {}


    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.sword = false;
        this.wings = false;
        this.key = false;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public Boolean getSword() {
        return sword;
    }

    public Boolean getWings() {
        return wings;
    }

    public Boolean getKey() {
        return key;
    }

    public void setHealth(Integer healthChange) {
        health = health + healthChange;
    }

    public void setSword(Boolean status) {
        sword = status;
    }
    public void setWings(Boolean status) {
        wings = status;
    }
    public void setKey(Boolean status) {
        key = status;
    }

}
