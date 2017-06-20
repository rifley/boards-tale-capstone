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
    String item;
    String itemDescription;
    String enemy;
    String enemyDescription;
    List<String> enemyOutcomes;
    Integer healthChange;



    public Level() {}

    public Level(String title, String description, String item, String itemDescription, ) {

    }

}
