import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Acciones de una opcion de una pregunta
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class C7 extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta7c();
 
    }
    /**
     * el metodo respuesta actua cuando el usuario clickea esa 
     * respuesta y suma al calificador si es correcta
     */
    public void Respuesta7c()
    {
       
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new resultados());
            
        } 
    }
}
