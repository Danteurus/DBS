import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double ac;
    private double fails;
    public void act() 
    {
        carMoving();
        carTurning();
        carKnock();
    }
    
    public void carMoving()
    {   
        if(Greenfoot.isKeyDown("up"))
        {
            ac = ac + 0.25;
        }
        
        if(ac <= 0)
        {
            ac = ac + 0.1;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            ac = ac - 0.25;
        }
        
        if(ac >= 0)
        {
            ac = ac - 0.1;
        }
        
        if(ac > 20)
        {
            ac = 20;
        }
        
        if(ac < -5)
        {
            ac = -5;
        }
        move((10);
        //prueba
    }
    
    public void carTurning()
    {   
        if(((int) ac) > 0)
        {
            if(Greenfoot.isKeyDown("left"))
            {
                turn(-4);
            }
            
            if(Greenfoot.isKeyDown("right"))
            {
                turn(4);
            }
        }
        if(((int) ac) < 0)
        {
            if(Greenfoot.isKeyDown("left"))
            {
                turn(4);
            }
            
            if(Greenfoot.isKeyDown("right"))
            {
                turn(-4);
            }
        }
    }
    
    public void carKnock()
    {
        /* Actor cone;
        cone = getOneObjectAtOffset(0, 0, cone.class);
        if(cone != null)
        {
            World world;
            world = getWorld();
            world.removeObject(cone);
        }
        */
        Actor cono = getOneIntersectingObject(cone.class);
        if(cono!=null){
            getWorld().removeObject(cono);
            fails ++;
        }
        if (fails >= 3)
        {
            if(getWorld() instanceof test1P){
                Greenfoot.setWorld(new test1P());
            }
        }
    }
}
