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
            if(getWorld() instanceof pr1s2)
            {
                Greenfoot.setWorld(new pr2s2());
            }
            if(getWorld() instanceof pr2s2)
            {
                Greenfoot.setWorld(new pr3s2());
            }
            if(getWorld() instanceof pr3s2)
            {
                Greenfoot.setWorld(new pr4s2());
            }
            if(getWorld() instanceof pr4s2)
            {
                Greenfoot.setWorld(new pr5s2());
            }
            if(getWorld() instanceof pr5s2)
            {
                Greenfoot.setWorld(new pr6s2());
            }
            if(getWorld() instanceof pr6s2)
            {
                Greenfoot.setWorld(new pr7s2());
            }
            if(getWorld() instanceof pr7s2)
            {
                Greenfoot.setWorld(new test2P());
            }
            if(getWorld() instanceof pr1s3)
            {
                Greenfoot.setWorld(new pr2s3());
            }
            if(getWorld() instanceof pr2s3)
            {
                Greenfoot.setWorld(new pr3s3());
            }
            if(getWorld() instanceof pr3s3)
            {
                Greenfoot.setWorld(new pr4s3());
            }
            if(getWorld() instanceof pr4s3)
            {
                Greenfoot.setWorld(new pr5s3());
            }
            if(getWorld() instanceof pr5s3)
            {
                Greenfoot.setWorld(new pr6s3());
            }
            if(getWorld() instanceof pr6s3)
            {
                Greenfoot.setWorld(new pr7s3());
            }
            if(getWorld() instanceof pr7s3)
            {
                Greenfoot.setWorld(new test3P());
            }
            if(getWorld() instanceof pr1s4)
            {
                Greenfoot.setWorld(new pr2s4());
            }
            if(getWorld() instanceof pr2s4)
            {
                Greenfoot.setWorld(new pr3s4());
            }
            if(getWorld() instanceof pr3s4)
            {
                Greenfoot.setWorld(new pr4s4());
            }
            if(getWorld() instanceof pr4s4)
            {
                Greenfoot.setWorld(new pr5s4());
            }
            if(getWorld() instanceof pr5s4)
            {
                Greenfoot.setWorld(new pr6s4());
            }
            if(getWorld() instanceof pr6s4)
            {
                Greenfoot.setWorld(new pr7s4());
            }
            if(getWorld() instanceof pr7s4)
            {
                Greenfoot.setWorld(new test4P());
            }
            if(getWorld() instanceof pr1s5)
            {
                Greenfoot.setWorld(new pr2s5());
            }
            if(getWorld() instanceof pr2s5)
            {
                Greenfoot.setWorld(new pr3s5());
            }
            if(getWorld() instanceof pr3s5)
            {
                Greenfoot.setWorld(new pr4s5());
            }
            
            if(getWorld() instanceof pr4s5)
            {
                Greenfoot.setWorld(new test5P());
            }
        }
        
    }    
}
