import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class l here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class l extends Actor
{
    /**
     * Act - do whatever the l wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeWorld();
    }
    
    public void changeWorld()
    {
        if (Greenfoot.mouseClicked(this)) {
            if(getWorld() instanceof man1)
            {
                Greenfoot.setWorld(new menu());
            }
            if(getWorld() instanceof man2)
            {
                Greenfoot.setWorld(new man1());
            }
            if(getWorld() instanceof man3)
            {
                Greenfoot.setWorld(new man2());
            }
            if(getWorld() instanceof man4)
            {
                Greenfoot.setWorld(new man3());
            }
            if(getWorld() instanceof man5)
            {
                Greenfoot.setWorld(new man4());
            }
            if(getWorld() instanceof man6)
            {
                Greenfoot.setWorld(new man5());
            }
        }
        
    }
}