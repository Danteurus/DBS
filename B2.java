import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Acciones de una opcion de una pregunta
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
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
    /**
     * el metodo respuesta actua cuando el usuario clickea esa 
     * respuesta y muestra correcto o incorrecto
     */
    public void Respuesta2b()
    {
        
        if (Greenfoot.mouseClicked(this)) {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,901,100);
            retorno n= new retorno();
            getWorld().addObject(n,901,450);
        } 
    }
}
