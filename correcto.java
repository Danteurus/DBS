import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que sirve como correcto.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class correcto extends Actor
{
    /**
     * Act - do whatever the correcto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World world;
    
    public void act() 
    {
        if(world instanceof pr1s1)
        {
            Greenfoot.setWorld(new pr1s1());
        }
        if(world instanceof man2)
        {
            Greenfoot.setWorld(new man3());
        }
        if(world instanceof man3)
        {
            Greenfoot.setWorld(new man4());
        }
        if(world instanceof man4)
        {
            Greenfoot.setWorld(new man5());
        }
        if(world instanceof man5)
        {
            Greenfoot.setWorld(new man6());
        }
        if(world instanceof man6)
        {
            Greenfoot.setWorld(new menu());
        }
    }
}
