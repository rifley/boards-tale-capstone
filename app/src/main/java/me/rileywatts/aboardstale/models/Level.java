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
    List<String> options;
    List<String> outcomes;
    Boolean item;
    String itemName;
    String itemDescription;
    Boolean enemy;
    String enemyName;
    String enemyDescription;
    List<String> enemyOutcomes;
    Integer healthChange;
    String adjacentNorth;
    String adjacentEast;
    String adjacentSouth;
    String adjacentWest;



    public Level() {}

    public Level(String title, String description, List<String> options, List<String> outcomes, Boolean item, String itemName, String itemDescription, Boolean enemy, String enemyName, String enemyDescription, List<String> enemyOutcomes,Integer healthChange, String adjacentNorth, String adjacentEast, String adjacentSouth, String adjacentWest ) {
        this.title = title;
        this.description = description;

        this.item = item;
        this.itemName = itemName;
        this.options = options;
        this.outcomes = outcomes;
        this.itemDescription = itemDescription;
        this.enemy = enemy;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyOutcomes = enemyOutcomes;
        this.healthChange = healthChange;
        this.adjacentNorth = adjacentNorth;
        this.adjacentEast = adjacentEast;
        this.adjacentSouth = adjacentSouth;
        this.adjacentWest = adjacentWest;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getOptions() {
        return options;
    }

    public List<String> getOutcomes() {
        return outcomes;
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

    public String getAdjacentNorth() {
        return adjacentNorth;
    }

    public String getAdjacentEast() {
        return adjacentEast;
    }

    public String getAdjacentSouth() {
        return adjacentSouth;
    }

    public String getAdjacentWest() {
        return adjacentWest;
    }

    public void setItem() {
        item = false;
    }

    public void setEnemy() {
        enemy = false;
    }

}
