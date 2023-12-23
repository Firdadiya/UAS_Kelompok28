import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tampilan_Depan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tampilan_Depan extends World
{

    /**
     * Constructor for objects of class Tampilan_Depan.
     * 
     */
    public Tampilan_Depan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pemeran_Utama pemeran_Utama = new Pemeran_Utama();
        addObject(pemeran_Utama,143,429);
        Eaten_1 eaten_1 = new Eaten_1();
        addObject(eaten_1,23,58);
        Eaten_2 eaten_2 = new Eaten_2();
        addObject(eaten_2,152,196);
        Eaten_3 eaten_3 = new Eaten_3();
        addObject(eaten_3,281,35);
        Eaten_4 eaten_4 = new Eaten_4();
        addObject(eaten_4,77,113);
        Eaten_5 eaten_5 = new Eaten_5();
        addObject(eaten_5,237,126);
        Not_Eaten_1 not_Eaten_1 = new Not_Eaten_1();
        addObject(not_Eaten_1,37,238);
        Not_Eaten_2 not_Eaten_2 = new Not_Eaten_2();
        addObject(not_Eaten_2,284,243);
        Not_Eaten_3 not_Eaten_3 = new Not_Eaten_3();
        addObject(not_Eaten_3,144,52);
        Tampilan_Score tampilan_Score = new Tampilan_Score("");
        addObject(tampilan_Score,252,480);
        tampilan_Score.setLocation(266,481);
        Tampilan_Darah tampilan_Darah = new Tampilan_Darah("HP :");
        addObject(tampilan_Darah,43,482);
        tampilan_Score.setLocation(253,478);
        tampilan_Darah.setLocation(55,482);
    }
}
