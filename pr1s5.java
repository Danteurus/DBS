import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pr1s5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pr1s5 extends World
{

    /**
     * Constructor for objects of class pr1s5.
     * 
     */
    public pr1s5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);  
        prepare();
    }
    private void prepare()
    {
        A a = new A();
        addObject(a,230,380);
        B b = new B();
        addObject(b,230,450);
        C c = new C();
        addObject(c,230,520);
    }
}
