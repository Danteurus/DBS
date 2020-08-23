import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pr7s1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pr7s1 extends World
{

    /**
     * Constructor for objects of class pr7s1.
     * 
     */
    public pr7s1()
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
        A7 a = new A7();
        addObject(a,560,227);
        B7 b = new B7();
        addObject(b,560,424);
        C7 c = new C7();
        addObject(c,560,580);
    }
}
