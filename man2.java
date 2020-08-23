import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Man2 es la segunda página del Manual.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class man2 extends World
{

    /**
     * Contructor de la clase Man2 que permite añadir las flechas al escenario.
     * 
     */
    public man2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * El método que permite colocar las flechas en la pantalla cuando
     * se genera la página del manual.
     */
    private void prepare()
    {
        l l = new l();
        addObject(l,721,356);
        r r = new r();
        addObject(r,1136,360);
    }
}
