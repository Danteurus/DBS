import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pregunta 5 de la secci�n 1.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class pr5s1 extends World
{

    /**
     * Constructor para la clase pr5s1.
     * 
     */
    public pr5s1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * M�todo que prepara las posibles respuestas a la pregunta.
     */
    private void prepare()
    {
        B5 b = new B5();
        addObject(b,590,444);
        A5 a = new A5();
        addObject(a,590,375);
        C5 c = new C5();
        addObject(c,590,514);
    }
}
