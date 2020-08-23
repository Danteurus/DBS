import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B2 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta2b();
 
    }   
    public void Respuesta2b()
    {
        
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr3s1());
        } 
    }
}
