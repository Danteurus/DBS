import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C2 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta2c();
 
    }   
    public void Respuesta2c()
    {
       
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr3s1());
        } 
    }
}
