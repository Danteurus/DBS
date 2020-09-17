import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class killer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class killer extends Actor
{
    /**
     * Act - do whatever the killer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor carnpcmove = getOneIntersectingObject(carnpcmove.class);
        if(carnpcmove!=null)
        {
            getWorld().removeObject(carnpcmove);
        }
    }    
}
