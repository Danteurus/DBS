import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bot�n que permite seleccionar la primera secci�n.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (a version number or a date)
 */
public class s1 extends Actor
{
    /**
     * Detecta si el usuario ha hecho clic en el bot�n, si lo ha hecho,
     * lo env�a a la secci�n 1.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new test1P());
        }
    }    
}
