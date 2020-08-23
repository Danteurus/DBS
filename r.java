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
     * Detecta en que página está el usuario, para dejarlo en la página correcta.
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
                Greenfoot.setWorld(new menu());
            }
        }
        
    }
}
