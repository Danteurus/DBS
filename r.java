import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón que permite al usuario ir a la página siguiente.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class r extends l
{
    /**
     * Activa el botón.
     */
    public void act() 
    {
        changeWorld();
    }
    /**
     * detecta la pregunta y al clickerse lo manda a la sigiente pregunta
     */
    public void changeWorld()
    {
        if (Greenfoot.mouseClicked(this)) {
            if(getWorld() instanceof man1)
            {
                Greenfoot.setWorld(new man2());
            }
            if(getWorld() instanceof man2)
            {
                Greenfoot.setWorld(new man3());
            }
            if(getWorld() instanceof man3)
            {
                Greenfoot.setWorld(new man4());
            }
            if(getWorld() instanceof man4)
            {
                Greenfoot.setWorld(new man5());
            }
            if(getWorld() instanceof man5)
            {
                Greenfoot.setWorld(new man6());
            }
            if(getWorld() instanceof man6)
            {
                Greenfoot.setWorld(new man21());
            }
            if(getWorld() instanceof man21)
            {
                Greenfoot.setWorld(new man22());
            }
            if(getWorld() instanceof man22)
            {
                Greenfoot.setWorld(new man23());
            }
            if(getWorld() instanceof man23)
            {
                Greenfoot.setWorld(new man24());
            }
            if(getWorld() instanceof man24)
            {
                Greenfoot.setWorld(new man31());
            }
            if(getWorld() instanceof man31)
            {
                Greenfoot.setWorld(new man32());
            }
            if(getWorld() instanceof man32)
            {
                Greenfoot.setWorld(new man33());
            }
            if(getWorld() instanceof man33)
            {
                Greenfoot.setWorld(new man41());
            }
            if(getWorld() instanceof man41)
            {
                Greenfoot.setWorld(new man42());
            }
            if(getWorld() instanceof man42)
            {
                Greenfoot.setWorld(new man43());
            }
            if(getWorld() instanceof man43)
            {
                Greenfoot.setWorld(new man51());
            }
            if(getWorld() instanceof man51)
            {
                Greenfoot.setWorld(new man52());
            }
            if(getWorld() instanceof man52)
            {
                Greenfoot.setWorld(new menu());
            }
        }
        
        }
        
    }
