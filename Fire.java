// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Fire extends Actor
{

    /**
     * 
     */
    public void Fire()
    {
    }

    /**
     * Act - do whatever the Fire wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move(5);
        eatBomb();
    }

    /**
     * 
     */
    public void eatBomb()
    {
        if (isTouching(Bomb.class)) {
            removeTouching(Bomb.class);
        }
    }
}
