import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A3 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta3a();
 
    }   
    public void Respuesta3a()
    {
        
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr4s1());
        } 
    }
}
