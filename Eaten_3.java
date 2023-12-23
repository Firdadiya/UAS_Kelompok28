import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eaten_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eaten_3 extends Eaaten
{
    /**
     * Act - do whatever the Eaten_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        Eaten_3 Eaten_3 = new Eaten_3();
        getWorld().addObject(Eaten_3,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
