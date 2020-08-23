import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase nos permite desplazarnos dentro de las opciones básicas de la app.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class menu extends World
{

    /**
     * El contructor de la clase menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Método que prepara todos los botones que deben estar presentes en el
     * menu.
     */
    private void prepare()
    {
        Secciones secciones = new Secciones();
        addObject(secciones,360,360);
        stats stats = new stats();
        addObject(stats,960,107);
        exit exit = new exit();
        addObject(exit,960,616);
        mWEB mWEB = new mWEB();
        addObject(mWEB,960,368);
    }
}
