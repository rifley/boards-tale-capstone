package me.rileywatts.aboardstale;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import me.rileywatts.aboardstale.models.Level;

/**
 * Created by Guest on 6/20/17.
 */

public class Constants {


    public static Level LEVEL_HOME = new Level("Home Sweet Home", "Home is where the heart is, and also your house.", Arrays.asList("Take a nap"), Arrays.asList("You feel stronger, healthier, and revitalised.", "You had a nightmare! Though you feel revitalised, you can't shake a feeling of dread and despair"), false, null, null, false, null, null, null, 80, 2, 4, 7, 5, "cave2");


    public static Level LEVEL_ONE = new Level("Sword in the Loam", "You notice something strange in the ground up ahead. It is covered in dirt and spider webs.", Arrays.asList("Grab the thing with confidence", "Attempt to get a better look at it from closer up"), Arrays.asList("From the loam you pull a sword, accidently cutting off your toe due to its momentum.", "You realise the thing is a sword hilt. You prepare yourself and yank it out with appropriate force."), true, "Sword", "Dull and rusty, but still effective", false, null, null, null, -20, null, 2, null, null, "cave2");


    public static Level LEVEL_TWO = new Level("Fields of Strife", "You notice your wife lying in the field, unresponsive", Arrays.asList("Shake her and scream at the top of your lungs to wake her up.", "Check to see if she is breathing"), Arrays.asList("Your wife, startled and annoyed, wakes up and says 'What the kuss? I was just taking a nap. Leave me alone you old fool'", "You realise your wife is just sleeping. You gently wake her up and she says 'Hi you! I seem to have drifted off. Im going back to sleep now'"), false, null, null, false, null, null, null, null, null, 3, 0, 1, "cave2");


    public static Level LEVEL_THREE = new Level("Riddler's Rock", "You see a hooded figure sitting on a rock. He cackles to himself as you approach and says 'You have no business here. Begone.'", Arrays.asList("Ask the hooded figure, 'Why?'", "Rush the hooded figure with no remorse.", "Kneel before the hooded figure."), Arrays.asList("The hooded figure points his finger back the way you came.", "The hooded figure procures a wand out of thin air and aims it at you.", "The hooded figure removed his hood and asks you, 'Why did the snake cross the road?"), false, null, null, true, "Hooded Figure", "A small, seemingly frail figure with a long shadow", Arrays.asList("You freeze, paralyzed by something beyond your control. The hooded figure says 'You made a big mistake, huge.' Your heart explodes.", "From the wand of the hooded figure a bolt of lightning shoots out directly at your heart. You fall to the ground, utterly defeated and without a heart.", "The hooded figure jabs you in the eye with their wand and you bleed out, all the while listening to his cackle."), -100, null, 11, 4, 2, "cave2");

    public static Level LEVEL_FOUR = new Level("Mouth of the Bear's Cave", "You see an entrance to a long and dark cave. As you approach you notice the sound of a snoring bear. The bear is sleeping at the mouth of the cave, barring free entry", Arrays.asList("Attempt to sneak past the bear anyway, entering the cave", "Sneak attack the bear"), Arrays.asList("You somehow manage to sneak by the bear and you see the cave is deep and dark.", "The bear wakes up and growls feroiciously", "You slay the bear with no remorse", "You successfully wound the bear, gouging its eyes. In its attempts to run away it runs off a cliff."), false, null, null, true, "Big mean bear", "A large, powerful creature with little regard for manners", Arrays.asList("The bear mauls your face and eats you up.", "The bear runs at you full speed. You see your life flash before your eyes and wonder why. You play dead and lose your left"), -50, 3, null, 8, 0, "cave2");

   public static Level LEVEL_FIVE = new Level("The Rolling Hills", "You smell smoke on the wind. Further off to the West you see clearer now that there is a fire in the Town Square. You hear screams for mercy and the suddenly fall silent", Arrays.asList("Get a better view of Town from up on the hill"), Arrays.asList("You see a man you don't recognize lighting fire to all the buildings in Town with a torch. He seems to be commanding a small crew and telling them to gather up the towns people."), false, null, null, false, null, null, null, null, null, 0, 6, 10, "cave2");

    public static Level LEVEL_SIX = new Level("Slithery Snek", "You see a snake slithering in the grass. He notices you, noticing him, and he approaches you and says, 'Salutationsss.'", Arrays.asList("A talking snake? Stomp it with your foot", "You reply, 'Hello friend, it is great to meet you. You are a wonderful individual.'"), Arrays.asList("The snake dodges your attack and hisses at you.", "Pleased with your humble nature, the snake happily replies,'As are you, Im sure! Take care now, Im off to find a pretty flower!'"), false, null, null, true, "Slithery Snek", "Small but precise, this snake knows who they are.", Arrays.asList("It bites your foot and slithers off, exclaming 'You'll regret that soon enough.'"), -30, 5, 7, null, null,"cave2");

    public static Level LEVEL_SEVEN = new Level("Apple Orchard", "You see an abundance of delicious apples gleaming with sunshine from here to the horizon", Arrays.asList("Eat an apple", "Save an apple for later"), Arrays.asList("You feel stronger and healthier. You wonder if the apple was magic. It was probably just a good apple", "While trying to pocket the apple for later, you have an overwhelming feeling of guilt. You decide to just drop it."), false, null, null, false, null, null, null, 30, 0, null, null, 6, "cave2");  // add game win after boss works

    public static Level LEVEL_EIGHT = new Level("Inside Cave", "You see a faint glow in the blackness. You venture further and see a glowing set of armor", Arrays.asList("Grab the armor", "Inspect the armor"), Arrays.asList("As you grab the armor, the cave begins to shake and starts to crumble. You make a break for it", "The armor seems to have a booty trap tied to it. With careful attention to detail, you successfully disarm the trap and grab the armor."), true, "Armor Set", "Armor of the Ancient Kings", true, "Cave", "Cave is fallinga apart", Arrays.asList("Part of the ceiling falls and hits you in the head."), -60, 4, null, null, null, "cave2");

    public static Level LEVEL_WIN = new Level("Floating Gate of Destiny", "You da best", Arrays.asList("Grab the armor", "Inspect the armor"), Arrays.asList("As you grab the armor, the cave begins to shake and starts to crumble. You make a break for it", "The armor seems to have a booty trap tied to it. With careful attention to detail, you successfully disarm the trap and grab the armor."), true, "Armor Set", "Armor of the Ancient Kings", true, "Cave", "Cave is fallinga apart", Arrays.asList("Part of the ceiling falls and hits you in the head."), -60, 7, null, null, null, "cave2");

    public static Level LEVEL_BOSS = new Level("Boss Todd", "As you enter town, you are quickly noticed by the man giving orders. He orders his men to surround you", Arrays.asList("Fight", "Run"), Arrays.asList("Something"), false, null, null, true, "Boss Todd", "A ruthless brute with muscles on his muscles.", Arrays.asList("You die", "You live"), -100, null, 5, null, null, "cave2");





    public static List<Level> Levels = Arrays.asList(LEVEL_HOME, LEVEL_ONE, LEVEL_TWO, LEVEL_THREE, LEVEL_FOUR, LEVEL_FIVE, LEVEL_SIX, LEVEL_SEVEN, LEVEL_EIGHT, LEVEL_WIN, LEVEL_BOSS);
}

