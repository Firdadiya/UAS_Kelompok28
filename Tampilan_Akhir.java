import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tampilan_Akhir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tampilan_Akhir extends World
{

    /**
     * Constructor for objects of class Tampilan_Akhir.
     * 
     */
    public Tampilan_Akhir()
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
        Button_Exit button_Exit = new Button_Exit();
        addObject(button_Exit,152,294);
        button_Exit.setLocation(150,332);
        button_Exit.setLocation(110,331);
        button_Exit.setLocation(163,292);
        button_Exit.setLocation(138,286);
        button_Exit.setLocation(143,324);
        Button_Retry button_Retry = new Button_Retry();
        addObject(button_Retry,143,324);
        button_Exit.setLocation(174,371);
        button_Exit.setLocation(176,286);
        button_Retry.setLocation(176,337);
        button_Exit.setLocation(157,283);
        button_Retry.setLocation(169,332);
        button_Retry.setLocation(178,345);
        button_Exit.setLocation(96,292);
        button_Exit.setLocation(93,323);
        button_Retry.setLocation(212,317);
        button_Retry.setLocation(225,322);
    }
}
