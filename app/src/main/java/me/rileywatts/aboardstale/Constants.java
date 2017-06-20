package me.rileywatts.aboardstale;

import java.util.Arrays;

import me.rileywatts.aboardstale.models.Level;

/**
 * Created by Guest on 6/20/17.
 */

public class Constants {

    public static Level LEVEL_ONE = new Level("Apple Orchard", "You see an abundance of delicious apples gleaming with sunshine from here to the horizon", Arrays.asList("Eat an apple", "Save an apple for later"), Arrays.asList("You feel stronger and healthier. You wonder if the apple was magic. It was probably just a good apple", "While trying to pocket the apple for later, you have an overwhelming feeling of guilt. You decide to just drop it."), false, null, null, false, null, null, null, 30, null, "LEVEL_TWO", "LEVEL_SIX", null);
}

    public static Level LEVEL_TWO = new Level("Fields of Strife", "You notice your wife lying in the field, unresponsive", Arrays.asList("Shake her and scream at the top of your lungs to wake her up.", "Check to see if she is breathing"), Arrays.asList("Your wife, startled and annoyed, wakes up and says 'What the kuss? I was just taking a nap. Leave me alone you old fool'", "You realise your wife is just sleeping. You gently wake her up and she says 'Hi you! I seem to have drifted off. Im going back to sleep now'"), false, null, null, false, null, null, null, 30, null, "LEVEL_THREE", "LEVEL_HOME", "LEVEL_ONE");
}


Arrays.asList("You live", "You die")