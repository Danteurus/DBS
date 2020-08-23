import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Primera prueba práctica.
 * 
 * @author (Cristian Serrano, Jean Portilla) 
 * @version (23/08/20)
 */
public class test1P extends World
{

    /**
     * Constructor para la clase test1P.
     * 
     */
    public test1P()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Método que prepara la prueba colocando el vehículo, obstaculos, entre otros.
     */
    private void prepare()
    {
        car car = new car();
        addObject(car,170,350);
        car.setLocation(121,360);
        cone cone = new cone();
        addObject(cone,47,288);
        cone cone2 = new cone();
        addObject(cone2,43,347);
        cone cone3 = new cone();
        addObject(cone3,41,415);
        cone cone4 = new cone();
        addObject(cone4,91,454);
        cone cone5 = new cone();
        addObject(cone5,101,251);
        cone cone6 = new cone();
        addObject(cone6,155,455);
        cone cone7 = new cone();
        addObject(cone7,212,457);
        cone cone8 = new cone();
        addObject(cone8,264,458);
        cone cone9 = new cone();
        addObject(cone9,315,480);
        cone cone10 = new cone();
        addObject(cone10,360,515);
        cone cone11 = new cone();
        addObject(cone11,381,576);
        cone cone12 = new cone();
        addObject(cone12,386,655);
        cone cone13 = new cone();
        addObject(cone13,154,249);
        cone cone14 = new cone();
        addObject(cone14,208,251);
        cone cone15 = new cone();
        addObject(cone15,260,250);
        cone cone16 = new cone();
        addObject(cone16,314,252);
        cone cone17 = new cone();
        addObject(cone17,372,254);
        cone cone18 = new cone();
        addObject(cone18,417,285);
        cone cone19 = new cone();
        addObject(cone19,446,679);
        cone cone20 = new cone();
        addObject(cone20,509,682);
        cone cone21 = new cone();
        addObject(cone21,573,685);
        cone cone22 = new cone();
        addObject(cone22,619,643);
        cone cone23 = new cone();
        addObject(cone23,619,579);
        cone cone24 = new cone();
        addObject(cone24,619,512);
        cone cone25 = new cone();
        addObject(cone25,621,444);
        cone cone26 = new cone();
        addObject(cone26,620,391);
        cone cone27 = new cone();
        addObject(cone27,620,337);
        cone cone28 = new cone();
        addObject(cone28,622,279);
        cone cone29 = new cone();
        addObject(cone29,622,228);
        cone cone30 = new cone();
        addObject(cone30,622,171);
        cone cone31 = new cone();
        addObject(cone31,416,229);
        cone cone32 = new cone();
        addObject(cone32,416,169);
        cone cone33 = new cone();
        addObject(cone33,418,119);
        cone cone34 = new cone();
        addObject(cone34,421,63);
        cone cone35 = new cone();
        addObject(cone35,452,35);
        cone cone36 = new cone();
        addObject(cone36,505,35);
        cone cone37 = new cone();
        addObject(cone37,550,35);
        cone cone38 = new cone();
        addObject(cone38,594,37);
        cone cone39 = new cone();
        addObject(cone39,624,76);
        cone cone40 = new cone();
        addObject(cone40,623,121);
        cone39.setLocation(625,65);
        cone40.setLocation(624,126);
        cone17.setLocation(367,289);
        cone18.setLocation(406,346);
        cone cone41 = new cone();
        addObject(cone41,413,283);
        cone31.setLocation(414,229);
        cone12.setLocation(378,635);
        cone19.setLocation(437,684);
        cone20.setLocation(509,698);
        cone5.setLocation(100,271);
        cone13.setLocation(157,270);
        cone.setLocation(50,314);
        cone3.setLocation(47,409);
        cone4.setLocation(89,453);
        cone6.setLocation(154,455);
        cone14.setLocation(213,274);
        cone15.setLocation(260,274);
        cone16.setLocation(307,279);
        cone18.setLocation(414,330);
        cone17.setLocation(356,298);
        cone18.setLocation(404,344);
        cone11.setLocation(399,571);
        cone12.setLocation(394,644);
        cone11.setLocation(417,575);
        cone8.setLocation(260,476);
        cone9.setLocation(311,492);
        cone10.setLocation(363,548);
        cone11.setLocation(396,587);
        cone10.setLocation(362,531);
        cone20.setLocation(503,689);
        cone9.setLocation(311,500);
        cone10.setLocation(361,541);
        cone11.setLocation(395,590);
        cone21.setLocation(567,698);
        cone22.setLocation(598,643);
        cone23.setLocation(614,571);
        cone39.setLocation(626,73);
        cone40.setLocation(621,114);
        cone40.setLocation(618,125);
        cone38.setLocation(593,42);
        removeObject(cone38);
        cone39.setLocation(588,64);
        cone40.setLocation(598,120);
        cone30.setLocation(599,173);
        cone30.setLocation(599,181);
        cone40.setLocation(594,127);
        cone29.setLocation(608,234);
        cone28.setLocation(603,286);
        cone22.setLocation(586,646);
        cone27.setLocation(598,333);
        cone26.setLocation(604,394);
        cone23.setLocation(591,576);
        cone24.setLocation(592,525);
        cone25.setLocation(602,454);
        cone25.setLocation(596,449);
        cone27.setLocation(599,349);
        cone28.setLocation(602,282);
        cone29.setLocation(601,235);
        cone21.setLocation(564,686);
        cone20.setLocation(508,691);
        cone21.setLocation(551,680);
        cone8.setLocation(272,477);
        cone9.setLocation(313,505);
        cone11.setLocation(397,579);
        cone12.setLocation(395,641);
        cone10.setLocation(360,539);
        cone9.setLocation(311,508);
        cone8.setLocation(264,502);
        removeObject(cone8);
        cone9.setLocation(297,500);
        cone9.setLocation(266,482);
        cone10.setLocation(303,504);
        cone11.setLocation(347,557);
        cone12.setLocation(384,624);
        cone19.setLocation(429,680);
        cone12.setLocation(387,622);
        cone12.setLocation(394,627);
        cone11.setLocation(358,563);
        cone10.setLocation(320,512);
        cone9.setLocation(265,477);
        cone20.setLocation(494,685);
        cone21.setLocation(551,689);
        cone20.setLocation(500,683);
        cone28.setLocation(600,293);
        cone29.setLocation(595,237);
        cone40.setLocation(593,124);
        cone30.setLocation(590,178);
        cone29.setLocation(588,237);
        cone28.setLocation(586,291);
        cone28.setLocation(582,288);
        cone27.setLocation(582,344);
        cone26.setLocation(586,401);
        cone25.setLocation(583,448);
        cone24.setLocation(579,490);
        cone23.setLocation(584,564);
        cone22.setLocation(583,616);
        cone21.setLocation(552,672);
        cone22.setLocation(582,636);
        cone23.setLocation(575,574);
        cone24.setLocation(577,522);
        cone25.setLocation(584,460);
        cone26.setLocation(583,391);
        cone27.setLocation(584,347);
        cone28.setLocation(583,296);
        cone29.setLocation(590,230);
        cone30.setLocation(593,171);
        cone40.setLocation(593,112);
        cone39.setLocation(588,66);
        cone20.setLocation(493,689);
        cone21.setLocation(546,688);
        cone19.setLocation(433,694);
        cone19.setLocation(441,688);
        cone22.setLocation(580,636);
        cone25.setLocation(580,465);
        cone22.setLocation(578,633);
        cone22.setLocation(571,633);
        cone22.setLocation(571,629);
        cone26.setLocation(581,409);
        cone40.setLocation(590,119);
        
    }
}
