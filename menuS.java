import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuS extends World
{

    /**
     * Constructor for objects of class menuS.
     * 
     */
    public menuS()
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
        back back = new back();
        addObject(back,640,616);
        s1 s1 = new s1();
        addObject(s1,105,291);
        s5 s5 = new s5();
        addObject(s5,1175,291);
        s3 s3 = new s3();
        addObject(s3,640,291);
        s2 s2 = new s2();
        addObject(s2,372,291);
        s4 s4 = new s4();
        addObject(s4,907,291);
    }
}
