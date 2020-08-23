import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pregunta 1 de la sección 1.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class pr1s1 extends World
{

    /**
     * Contructor para pr1s1.
     * 
     */
    public pr1s1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Método que coloca todas las posibles opciones de respuesta.
     */
    private void prepare()
    {
        A a = new A();
        addObject(a,689,330);
        B b = new B();
        addObject(b,689,404);
        C c = new C();
        addObject(c,689,494);
    }
}
