import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pr6s1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pr6s1 extends World
{

    /**
     * Constructor for objects of class pr6s1.
     * 
     */
    public pr6s1()
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
        B b = new B();
        addObject(b,590,417);
        A a = new A();
        addObject(a,590,350);
        C c = new C();
        addObject(c,590,485);
    }
}
