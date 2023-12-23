import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eaten_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eaten_5 extends Eaaten
{
    /**
     * Act - do whatever the Eaten_5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        Eaten_5 Eaten_5 = new Eaten_5();
        getWorld().addObject(Eaten_5,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
