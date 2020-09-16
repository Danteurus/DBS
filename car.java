import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El veh�culo que se utiliza durante las pruebas pr�cticas.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class car extends Actor
{
    private double ac; // Velocidad del veh�culo
    private double fails; // # de fallos
    private int pares;
    /**
     * Act - Este m�todo se ejecuta repetidamente mientras
     * el bot�n 'Act' o 'Run' han sido presionados.
     */
    public void act() 
    {
        carMoving();
        carTurning();
        carKnock();
        returnFails();
    }
    /**
     * F�sicas y controles de freno y aceleraci�n del veh�culo.
     */
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
        move((int) ac);
        //prueba
    }
    /**
     * carTurning() - M�todo necesario para que el veh�culo pueda girar.
     */
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
    /**
     * carKnock() - M�todo que detecta si el veh�culo ha chocado con alg�n
     * cono, de ser as�, elimina el cono y a�ade un error al contador de
     * errores; si los errores llegan a 3, la prueba se reiniciar�.
     * Ademas, si el vehiculo llega a la meta, este sera enviado al menu.
     */
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
        Actor meta = getOneIntersectingObject(meta.class);
        Actor carnpc = getOneIntersectingObject(carnpc.class);
        Actor pare = getOneIntersectingObject(pare.class);
        if(cono!=null){
            getWorld().removeObject(cono);
            fails ++;
        }
        if(carnpc!=null){
            Greenfoot.setWorld(new test2P());
        }
        if((pare!=null)&&((int) ac == 0)){
            pares++;
            getWorld().removeObject(pare);
            getWorld().addObject(new siga(), getX(), getY());
        }
        if(meta!=null){
            if(getWorld() instanceof test3P){
                if(pares > 0)
                {
                    Greenfoot.setWorld(new menu());
                }else{
                    Greenfoot.setWorld(new test3P());
                }
            }
        }
        if (fails >= 3)
        {
            if(getWorld() instanceof test1P){
                Greenfoot.setWorld(new test1P());
            }
            if(getWorld() instanceof test2P){
                Greenfoot.setWorld(new test2P());
            }
            if(getWorld() instanceof test3P){
                Greenfoot.setWorld(new test3P());
            }
            if(getWorld() instanceof test4P){
                Greenfoot.setWorld(new test4P());
            }
            if(getWorld() instanceof test5P){
                Greenfoot.setWorld(new test5P());
            }
        }
    }
    /**
     * returnFails() - Este metodo permite al usuario ver la cantidad de errores m�ximos que puede cometer.
     */
    public void returnFails()
    {
        getWorld().showText(String.valueOf((int) (2 - this.fails)), 1200, 700);
    }
}
