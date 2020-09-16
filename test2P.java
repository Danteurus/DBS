
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test2P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test2P extends World
{

    /**
     * Constructor for objects of class test2P.
     * 
     */
    public test2P()
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
        car car = new car();
        addObject(car,578,614);
        car.turn(-90);
        cone cone = new cone();
        addObject(cone,34,270);
        cone cone2 = new cone();
        addObject(cone2,74,270);
        cone cone3 = new cone();
        addObject(cone3,121,272);
        cone cone4 = new cone();
        addObject(cone4,178,272);
        cone cone5 = new cone();
        addObject(cone5,235,273);
        cone cone6 = new cone();
        addObject(cone6,289,276);
        cone cone7 = new cone();
        addObject(cone7,338,277);
        cone cone8 = new cone();
        addObject(cone8,392,274);
        cone cone9 = new cone();
        addObject(cone9,446,274);
        cone cone10 = new cone();
        addObject(cone10,501,274);
        cone cone11 = new cone();
        addObject(cone11,550,275);
        cone cone12 = new cone();
        addObject(cone12,605,277);
        cone cone13 = new cone();
        addObject(cone13,652,276);
        cone cone14 = new cone();
        addObject(cone14,706,277);
        cone cone15 = new cone();
        addObject(cone15,757,277);
        cone cone16 = new cone();
        addObject(cone16,802,277);
        cone cone17 = new cone();
        addObject(cone17,853,277);
        cone cone18 = new cone();
        addObject(cone18,896,277);
        cone cone19 = new cone();
        addObject(cone19,941,277);
        cone cone20 = new cone();
        addObject(cone20,991,278);
        cone cone21 = new cone();
        addObject(cone21,1034,280);
        cone cone22 = new cone();
        addObject(cone22,1083,279);
        cone cone23 = new cone();
        addObject(cone23,1124,279);
        cone cone24 = new cone();
        addObject(cone24,1167,279);
        cone cone25 = new cone();
        addObject(cone25,1215,281);
        cone cone26 = new cone();
        addObject(cone26,1259,282);
        cone cone27 = new cone();
        addObject(cone27,19,445);
        cone cone28 = new cone();
        addObject(cone28,66,444);
        cone cone29 = new cone();
        addObject(cone29,118,447);
        cone cone30 = new cone();
        addObject(cone30,162,447);
        cone cone31 = new cone();
        addObject(cone31,207,449);
        cone cone32 = new cone();
        addObject(cone32,244,449);
        cone cone33 = new cone();
        addObject(cone33,283,451);
        cone cone34 = new cone();
        addObject(cone34,327,449);
        cone cone35 = new cone();
        addObject(cone35,368,450);
        cone cone36 = new cone();
        addObject(cone36,412,452);
        cone cone37 = new cone();
        addObject(cone37,458,452);
        cone cone38 = new cone();
        addObject(cone38,498,454);
        cone cone39 = new cone();
        addObject(cone39,496,497);
        cone cone40 = new cone();
        addObject(cone40,495,552);
        cone cone41 = new cone();
        addObject(cone41,493,608);
        cone cone42 = new cone();
        addObject(cone42,492,669);
        cone cone43 = new cone();
        addObject(cone43,538,705);
        cone cone44 = new cone();
        addObject(cone44,588,708);
        cone cone45 = new cone();
        addObject(cone45,636,708);
        cone cone46 = new cone();
        addObject(cone46,660,663);
        cone cone47 = new cone();
        addObject(cone47,660,609);
        cone cone48 = new cone();
        addObject(cone48,661,558);
        cone cone49 = new cone();
        addObject(cone49,659,512);
        cone cone50 = new cone();
        addObject(cone50,659,459);
        cone cone51 = new cone();
        addObject(cone51,705,459);
        cone cone52 = new cone();
        addObject(cone52,749,459);
        cone cone53 = new cone();
        addObject(cone53,787,459);
        cone cone54 = new cone();
        addObject(cone54,829,461);
        cone cone55 = new cone();
        addObject(cone55,870,460);
        cone cone56 = new cone();
        addObject(cone56,910,460);
        cone cone57 = new cone();
        addObject(cone57,954,462);
        cone cone58 = new cone();
        addObject(cone58,993,462);
        cone cone59 = new cone();
        addObject(cone59,1038,463);
        cone cone60 = new cone();
        addObject(cone60,1080,464);
        cone cone61 = new cone();
        addObject(cone61,1122,465);
        cone cone62 = new cone();
        addObject(cone62,1167,465);
        cone cone63 = new cone();
        addObject(cone63,1211,464);
        cone cone64 = new cone();
        addObject(cone64,1256,463);
        carnpc carnpc = new carnpc();
        addObject(carnpc,796,333);
        preventiva preventiva = new preventiva();
        addObject(preventiva,575,375);
        cone cone65 = new cone();
        addObject(cone65,676,313);
        cone cone66 = new cone();
        addObject(cone66,703,340);
        cone cone67 = new cone();
        addObject(cone67,736,358);
        meta meta = new meta();
        addObject(meta,1170,374);
        preventiva.setLocation(570,370);
    }
}
