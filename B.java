    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que actua como opci�n B en las preguntas teoricas.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
 public class B extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta1b();
 
    }   
    public void Respuesta1b()
    {
        int cal=0;
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pr2s1());
        } 
    }
}