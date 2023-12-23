import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eaten_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eaten_4 extends Eaaten
{
    /**
     * Act - do whatever the Eaten_4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        Eaten_4 Eaten_4 = new Eaten_4();
        getWorld().addObject(Eaten_4,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
