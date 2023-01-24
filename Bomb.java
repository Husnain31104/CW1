// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bomb extends Actor
{

    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
            move(Greenfoot.getRandomNumber(10) - 5);
        }
        else {
        }
        eatBug();
    }

    /**
     * 
     */
    public void eatBug()
    {
        if (isTouching(Bug.class)) {
            removeTouching(Bug.class);
            getWorld().showText("You Lose", 300, 200);
        }
    }
}
