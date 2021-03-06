import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pregunta 4 de la secci�n 1.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class pr4s1 extends World
{

    /**
     * Constructor para la clase pr4s1.
     * 
     */
    public pr4s1()
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
        B4 b = new B4();
        addObject(b,700,403);
        A4 a = new A4();
        addObject(a,700,339);
        C4 c = new C4();
        addObject(c,700,469);
    }
}
