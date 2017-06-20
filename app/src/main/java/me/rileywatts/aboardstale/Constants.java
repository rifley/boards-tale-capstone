package me.rileywatts.aboardstale;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import me.rileywatts.aboardstale.models.Level;

/**
 * Created by Guest on 6/20/17.
 */

public class Constants {


    public static Level LEVEL_HOME = new Level("Home Sweet Home", "Home is where the heart is, and also your house.", Arrays.asList("Take a nap"), Arrays.asList("You feel stronger, healthier, and revitalised.", "You had a nightmare! Though you feel revitalised, you can't shake a feeling of dread and despair"), false, null, null, false, null, null, null, 80, 2, 4, 7, 5);


    public static Level LEVEL_ONE = new Level("Apple Orchard", "You see an abundance of delicious apples gleaming with sunshine from here to the horizon", Arrays.asList("Eat an apple", "Save an apple for later"), Arrays.asList("You feel stronger and healthier. You wonder if the apple was magic. It was probably just a good apple", "While trying to pocket the apple for later, you have an overwhelming feeling of guilt. You decide to just drop it."), false, null, null, false, null, null, null, 30, null, 2, 5, null);


    public static Level LEVEL_TWO = new Level("Fields of Strife", "You notice your wife lying in the field, unresponsive", Arrays.asList("Shake her and scream at the top of your lungs to wake her up.", "Check to see if she is breathing"), Arrays.asList("Your wife, startled and annoyed, wakes up and says 'What the kuss? I was just taking a nap. Leave me alone you old fool'", "You realise your wife is just sleeping. You gently wake her up and she says 'Hi you! I seem to have drifted off. Im going back to sleep now'"), false, null, null, false, null, null, null, null, null, 3, 0, 1);


    public static Level LEVEL_THREE = new Level("Riddler's Rock", "You see a hooded figure sitting on a rock. He cackles to himself as you approach and says 'You have no business here. Begone.'", Arrays.asList("Ask the hooded figure, 'Why?'", "Rush the hooded figure with no remorse.", "Kneel before the hooded figure."), Arrays.asList("The hooded figure points his finger back the way you came.", "The hooded figure procures a wand out of thin air and aims it at you.", "The hooded figure removed his hood and asks you, 'Why did the snake cross the road?"), false, null, null, true, "Hooded Figure", "A small, seemingly frail figure with a long shadow", Arrays.asList("You freeze, paralyzed by something beyond your control. The hooded figure says 'You made a big mistake, huge.' Your heart explodes.", "From the wand of the hooded figure a bolt of lightning shoots out directly at your heart. You fall to the ground, utterly defeated and without a heart.", "The hooded figure jabs you in the eye with their wand and you bleed out, all the while listening to his cackle."), -100, null, 11, 4, 2);

    public static Level LEVEL_FOUR = new Level("Mouth of the Bear's Cave", "You see an entrance to a long and dark cave. As you approach you notice the sound of a snoring bear. The bear is sleeping at the mouth of the cave, barring free entry", Arrays.asList("Attempt to sneak past the bear anyway, entering the cave", "Sneak attack the bear"), Arrays.asList("You somehow manage to sneak by the bear and you see the cave is deep and dark.", "The bear wakes up and growls feroiciously", "You slay the bear with no remorse", "You successfully wound the bear, gouging its eyes. In its attempts to run away it runs off a cliff."), false, null, null, true, "Big mean bear", "A large, powerful creature with little regard for manners", Arrays.asList("The bear mauls your face and eats you up.", "The bear runs at you full speed. You see your life flash before your eyes and wonder why. You play dead and lose your left"), -50, 3, null, 8, 0);

   public static Level LEVEL_FIVE = new Level("The Rolling Hills", "You smell smoke on the wind. Further off to the West you see clearer now that there is a fire in the Town Square. You hear screams for mercy and the suddenly fall silent", Arrays.asList("Get a better view of Town from up on the hill"), Arrays.asList("You see a man you don't recognize lighting fire to all the buildings in Town with a torch. He seems to be commanding a small crew and telling them to gather up the towns people."), false, null, null, false, null, null, null, null, null, 0, 6, 10);

    public static Level LEVEL_SIX = new Level("Apple Orchard", "You see an abundance of delicious apples gleaming with sunshine from here to the horizon", Arrays.asList("Eat an apple", "Save an apple for later"), Arrays.asList("You feel stronger and healthier. You wonder if the apple was magic. It was probably just a good apple", "While trying to pocket the apple for later, you have an overwhelming feeling of guilt. You decide to just drop it."), false, null, null, false, null, null, null, 30, null, 2, 5, null);


    public static List<Level> Levels = Arrays.asList(LEVEL_HOME, LEVEL_ONE, LEVEL_TWO, LEVEL_THREE, LEVEL_FOUR, LEVEL_FIVE, LEVEL_SIX);
}

