import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta1c();
 
    }   
    public void Respuesta1c()
    {
        int cal=0;
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr2s1());
        } 
    }
}