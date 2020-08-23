import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Simple botón que permite acceder al menú de secciones.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (a version number or a date)
 */
public class Secciones extends Actor
{
    /**
     * Act - do whatever the Secciones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new menuS());
        }
    }    
}
