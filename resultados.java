import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**

 * Acciones de una opcion de una pregunta
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class resultados extends World
{

    /**
     * Constructor for objects of class resultados.
     * 
     */
    public resultados()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        agg();
        prepare();
    }

    private void agg()
    {
        generar_r respuestas =new generar_r();
        addObject(respuestas,170,350);
        respuestas.setLocation(269,360);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,901,518);
    }
}
