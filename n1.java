import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que sirve como siguiente pregunta.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class n1 extends Actor
{
    /**
     * Act - do whatever the n1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            if(getWorld() instanceof pr1s1)
            {
                Greenfoot.setWorld(new pr2s1());
            }
            if(getWorld() instanceof pr2s1)
            {
                Greenfoot.setWorld(new pr3s1());
            }
            if(getWorld() instanceof pr3s1)
            {
                Greenfoot.setWorld(new pr4s1());
            }
            if(getWorld() instanceof pr4s1)
            {
                Greenfoot.setWorld(new pr5s1());
            }
            if(getWorld() instanceof pr5s1)
            {
                Greenfoot.setWorld(new pr6s1());
            }
            if(getWorld() instanceof pr6s1)
            {
                Greenfoot.setWorld(new pr7s1());
            }
            if(getWorld() instanceof pr7s1)
            {
                Greenfoot.setWorld(new test1P());
            }
        }
        
    }    
}
