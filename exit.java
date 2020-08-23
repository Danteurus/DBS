import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Simple botón que permite al usuario cerrar la app.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class exit extends Actor
{
    /**
     * Permite al usuario dar clic sobre el objeto y detectarlo.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            System.exit(0);
        }
    }    
}
