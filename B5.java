import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B5 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta5b();
 
    }   
    public void Respuesta5b()
    {
       
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr6s1());
        } 
    }
}
