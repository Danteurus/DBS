import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que actua como opci�n C en las preguntas teoricas.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
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
    /**
     * el metodo respuesta actua cuando el usuario clickea esa 
     * respuesta y suma al calificador si es correcta
     */
    public void Respuesta1c()
    {
        int cal=0;
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr2s1());
            cal=cal+1;
        } 
    }
}