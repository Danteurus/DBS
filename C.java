import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que actua como opci�n C en las preguntas teoricas.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/2020)
 */
public class C extends respuestas
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Respuesta1c();
 
    } 
    /**
     * el metodo respuesta actua cuando el usuario clickea esa 
     * respuesta y muestra correcto e incorrecto
     */
    public void Respuesta1c()
    {
         if (Greenfoot.mouseClicked(this)) {
            if(getWorld() instanceof pr1s1)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,901,100);
            n1 n= new n1();
            getWorld().addObject(n,901,450);
            }
            if(getWorld() instanceof pr1s2)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
            if(getWorld() instanceof pr2s2)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
            if(getWorld() instanceof pr3s2)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450);         
            }
             if(getWorld() instanceof pr4s2)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr5s2)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450);  
            }
             if(getWorld() instanceof pr6s2)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr7s2)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450); 
            }
             if(getWorld() instanceof pr1s3)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr2s3)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450); 
            }
             if(getWorld() instanceof pr3s3)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr4s3)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr5s3)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr6s3)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
              if(getWorld() instanceof pr7s3)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr1s4)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
              if(getWorld() instanceof pr2s4)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr3s4)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr4s4)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr5s4)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450); 
            }
             if(getWorld() instanceof pr6s4)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
              if(getWorld() instanceof pr7s4)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr1s5)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450);
            }
              if(getWorld() instanceof pr2s5)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
             if(getWorld() instanceof pr3s5)
            {
            incorrecto cor = new incorrecto();
            getWorld().addObject(cor,1000,100);
            retorno n= new retorno();
            getWorld().addObject(n,300,450);
            }
              if(getWorld() instanceof pr4s5)
            {
            correcto cor = new correcto();
            getWorld().addObject(cor,1000,100);
            n1 n= new n1();
            getWorld().addObject(n,300,450);
            }
        } 
        
    }
}