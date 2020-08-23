import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Man1 es la primera página del Manual.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class man1 extends World
{

    /**
     * Contructor de la clase Man1 que permite añadir las flechas al escenario.
     * 
     */
    public man1()
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
        addObject(l,67,652);
        r r = new r();
        addObject(r,1220,660);
    }
}
