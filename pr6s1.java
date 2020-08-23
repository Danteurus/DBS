import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pregunta 6 de la sección 1.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class pr6s1 extends World
{

    /**
     * Constructor para la clase pr6s1.
     * 
     */
    public pr6s1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Método que prepara las posibles respuestas a la pregunta.
     */
    private void prepare()
    {
        B6 b = new B6();
        addObject(b,590,417);
        A6 a = new A6();
        addObject(a,590,350);
        C6 c = new C6();
        addObject(c,590,485);
    }
}
