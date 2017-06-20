package me.rileywatts.aboardstale.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 6/20/17.
 */

@Parcel
public class Level {
    String title;
    String description;
    Boolean item;
    String itemName;
    String itemDescription;
    Boolean enemy;
    String enemyName;
    String enemyDescription;
    List<String> enemyOutcomes;
    Integer healthChange;



    public Level() {}

    public Level(String title, String description, Boolean item, String itemName, String itemDescription, Boolean enemy, String enemyName, String enemyDescription, List<String> enemyOutcomes,Integer healthChange ) {
        this.title = title;
        this.description = description;
        this.item = item;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.enemy = enemy;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyOutcomes = enemyOutcomes;
        this.healthChange = healthChange;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean checkItem() {
        return item;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public Boolean checkEnemy() {
        return enemy;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
    }

    public List<String> getEnemyOutcomes() {
        return enemyOutcomes;
    }
    public Integer getHealthChange() {
        return healthChange;
    }

    public void setItem() {
        item = false;
    }

    public void setEnemy() {
        enemy = false;
    }

}
