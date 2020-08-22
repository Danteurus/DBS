import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menú here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class Menú.
     * 
     */
    public menu()
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
        Secciones secciones = new Secciones();
        addObject(secciones,360,360);
        stats stats = new stats();
        addObject(stats,961,107);
        exit exit = new exit();
        addObject(exit,960,616);
    }
}
