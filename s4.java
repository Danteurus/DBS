import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón que permite seleccionar la cuarta sección.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (a version number or a date)
 */
public class s4 extends Actor
{
    /**
     * Todavía no está implementada está sección (WIP)
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr1s4());
        }
    }     
}
