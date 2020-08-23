import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Simple bot�n que permite acceder al men� de secciones.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class Secciones extends Actor
{
    /**
     * Act permite que el usuario pueda interactuar con el bot�n al hacerle clic.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new menuS());
        }
    }    
}
