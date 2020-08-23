import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Man6 es la sexta p�gina del Manual.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class man6 extends World
{

    /**
     * Contructor de la clase Man6 que permite a�adir las flechas al escenario.
     * 
     */
    public man6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

     /**
     * El m�todo que permite colocar las flechas en la pantalla cuando
     * se genera la p�gina del manual.
     */
    private void prepare()
    {
        l l = new l();
        addObject(l,666,648);
        r r = new r();
        addObject(r,1204,660);
    }
}
