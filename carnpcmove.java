import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carnpcmove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carnpcmove extends Actor
{
    /**
     * Act - do whatever the carnpcmove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
    }
    
    public carnpcmove()
    {
        turn(180);
    }
}
