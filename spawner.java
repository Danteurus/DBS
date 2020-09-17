import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spawner extends Actor
{
    /**
     * Act - do whatever the spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int age;
    public void act() 
    {
        age++;
        if(age == 100)
        {
            getWorld().addObject(new carnpcmove(), getX(), getY());
            age = 0;
        }
    }    
}
