import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B4 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta4b();
 
    }   
    public void Respuesta4b()
    {
       
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr5s1());
        } 
    }
}