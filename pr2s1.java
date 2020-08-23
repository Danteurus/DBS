import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pregunta 2 de la sección 1.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class pr2s1 extends World
{

    /**
     * Constructor para la clase pr2s1.
     * 
     */
    public pr2s1()
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
        addObject(b,698,437);
        A a = new A();
        addObject(a,698,370);
        C c = new C();
        addObject(c,698,506);
    }
}
