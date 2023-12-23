import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pemeran_Utama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pemeran_Utama extends Actor
{
    /**
     * Act - do whatever the Pemeran_Utama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    
    void eaten(){
        Tampilan_Score.add(1);
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2, getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-2, getY());
        }
        if(isTouching(Not_Eaten.class)){
            Tampilan_Darah.add(-1);
            eaten();
        }
        if(Tampilan_Darah.value==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Tampilan_Akhir());
            getWorld().removeObject(this);
        }
    }
}
