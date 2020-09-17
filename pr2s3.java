import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pr2s3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pr2s3 extends World
{

    /**
     * Constructor for objects of class pr2s3.
     * 
     */
    public pr2s3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }
    private void prepare()
    {
        A a = new A();
        addObject(a,240,350);
        B b = new B();
        addObject(b,240,450);
        C c = new C();
        addObject(c,240,540);
    }
}
