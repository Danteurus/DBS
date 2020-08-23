import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man3 extends World
{

    /**
     * Constructor for objects of class man3.
     * 
     */
    public man3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        l l = new l();
        addObject(l,62,657);
        r r = new r();
        addObject(r,879,665);
    }
}
