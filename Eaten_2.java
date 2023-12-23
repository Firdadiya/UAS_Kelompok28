import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eaten_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eaten_2 extends Eaaten
{
    /**
     * Act - do whatever the Eaten_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        Eaten_2 Eaten_2 = new Eaten_2();
        getWorld().addObject(Eaten_2,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
