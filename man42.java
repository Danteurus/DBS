import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man42 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man42 extends World
{

    /**
     * Constructor for objects of class man42.
     * 
     */
    public man42()
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
        addObject(l,67,652);
        r r = new r();
        addObject(r,1220,660);
    }
}
