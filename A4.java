import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A4 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta4a();
 
    }   
    public void Respuesta4a()
    {
        
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr5s1());
        } 
    }
}