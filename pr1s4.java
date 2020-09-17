import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pr1s4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pr1s4 extends World
{

    /**
     * Constructor for objects of class pr1s4.
     * 
     */
    public pr1s4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        prepare();
    }
    private void prepare()
    {
        A a = new A();
        addObject(a,245,380);
        B b = new B();
        addObject(b,245,450);
        C c = new C();
        addObject(c,245,520);
    }
}
