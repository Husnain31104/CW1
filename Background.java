// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     */
    public Background()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bug bug =  new Bug();
        addObject(bug, 31, 195);
        Food food =  new Food();
        addObject(food, 70, 60);
        Food food2 =  new Food();
        addObject(food2, 521, 74);
        Food food3 =  new Food();
        addObject(food3, 544, 322);
        Food food4 =  new Food();
        addObject(food4, 232, 339);
        Bomb bomb =  new Bomb();
        addObject(bomb, 138, 75);
        Bomb bomb2 =  new Bomb();
        addObject(bomb2, 174, 203);
        Bomb bomb3 =  new Bomb();
        addObject(bomb3, 476, 232);
        Bomb bomb4 =  new Bomb();
        addObject(bomb4, 286, 85);
        Food food5 =  new Food();
        addObject(food5, 295, 185);
        Food food6 =  new Food();
        addObject(food6, 492, 366);
        Food food7 =  new Food();
        addObject(food7, 233, 30);
        Food food8 =  new Food();
        addObject(food8, 418, 47);
        Bomb bomb5 =  new Bomb();
        addObject(bomb5, 334, 369);
        Bomb bomb6 =  new Bomb();
        addObject(bomb6, 563, 109);
        Bomb bomb7 =  new Bomb();
        addObject(bomb7, 411, 142);
        Bomb bomb8 =  new Bomb();
        addObject(bomb8, 57, 353);
        Bomb bomb9 =  new Bomb();
        addObject(bomb9, 352, 259);
        Bonus bonus =  new Bonus();
        addObject(bonus, 551, 207);
        Bonus bonus2 =  new Bonus();
        addObject(bonus2, 26, 20);
        Bonus bonus3 =  new Bonus();
        addObject(bonus3, 176, 363);
        Bonus bonus4 =  new Bonus();
        addObject(bonus4, 338, 132);
    }
}
