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
        B b = new B();
        addObject(b,590,417);
        A a = new A();
        addObject(a,590,350);
        C c = new C();
        addObject(c,590,485);
    }
}
