// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bug extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the Bug wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(5);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        eatFood();
        eatBonus();
        fireProject();
    }

    /**
     * 
     */
    public void eatFood()
    {
        if (isTouching(Food.class)) {
            removeTouching(Food.class);
            score = score + 1;
            getWorld().showText("Score:" + score, 100, 30);
        }
    }

    /**
     * 
     */
    public void fireProject()
    {
        if (Greenfoot.mousePressed(null)) {
            getWorld().addObject( new  Fire(), getX(), getY());
        }
    }

    /**
     * 
     */
    public void eatBonus()
    {
        if (isTouching(Bonus.class)) {
            removeTouching(Bonus.class);
            score = score + 10;
            getWorld().showText("Score:" + score, 100, 30);
        }
    }
}
