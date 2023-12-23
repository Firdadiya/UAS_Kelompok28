import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eaten_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eaten_1 extends Eaaten
{
    /**
     * Act - do whatever the Eaten_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        Eaten_1 Eaten_1 = new Eaten_1();
        getWorld().addObject(Eaten_1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
