import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Not_Eaten_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Not_Eaten_1 extends Not_Eaten
{
    /**
     * Act - do whatever the Not_Eaten_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        Not_Eaten_1 Not_Eaten_1 = new Not_Eaten_1();
        getWorld().addObject(Not_Eaten_1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
