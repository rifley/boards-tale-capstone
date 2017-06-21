package me.rileywatts.aboardstale.models;

import org.parceler.Parcel;

import java.io.File;
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
    Boolean interaction;
    Boolean item;
    String itemName;
    String itemDescription;
    Boolean enemy;
    String enemyName;
    String enemyDescription;
    List<String> enemyOutcomes;
    Integer healthChange;
    Integer adjacentNorth;
    Integer adjacentEast;
    Integer adjacentSouth;
    Integer adjacentWest;
    String image;




    public Level() {}

    public Level(String title, String description, List<String> options, List<String> outcomes, Boolean item, String itemName, String itemDescription, Boolean enemy, String enemyName, String enemyDescription, List<String> enemyOutcomes,Integer healthChange, Integer adjacentNorth, Integer adjacentEast, Integer adjacentSouth, Integer adjacentWest, String image) {
        this.title = title;
        this.description = description;

        this.item = item;
        this.itemName = itemName;
        this.options = options;
        this.outcomes = outcomes;
        this.interaction = true;
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
        this.image = image;
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

    public Boolean checkInteraction() {
        return interaction;
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

    public Integer getAdjacentNorth() {
        return adjacentNorth;
    }

    public Integer getAdjacentEast() {
        return adjacentEast;
    }

    public Integer getAdjacentSouth() {
        return adjacentSouth;
    }

    public Integer getAdjacentWest() {
        return adjacentWest;
    }

    public String getImage() {
        return image;
    }

    public void setItem() {
        item = false;
    }

    public void setEnemy() {
        enemy = false;
    }

    public void setInteraction() {
        interaction = false;
    }

}
