import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 
/** 
 * genera el resultado del usuario
 *  
 * @author (Cristian Serrano, Jean Portilla)  
 * @version (23/08/2020) 
 */ 
public class generar_r extends respuestas
{
    String res="Respuestas correctas";
    public void act() 
    {
        returnCals();// Add your action code here.
    }
    public void returnCals()
    {
        if (Greenfoot.mouseClicked(this)) {
        getWorld().showText(res, 1000, 700);
        getWorld().showText(String.valueOf(cal), 1200, 700);
    }
    }
}
