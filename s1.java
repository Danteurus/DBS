import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón que permite seleccionar la primera sección.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (a version number or a date)
 */
public class s1 extends Actor
{
    /**
     * Detecta si el usuario ha hecho clic en el botón, si lo ha hecho,
     * lo envía a la sección 1.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new test1P());
        }
    }    
}
