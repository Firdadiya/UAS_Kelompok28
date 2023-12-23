import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eaaten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Eaaten extends Actor
{
    /**
     * Act - do whatever the Eaaten wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void cetakbaru();
    abstract void maju();
    void eaten(){
        Tampilan_Score.add(1);
        
        cetakbaru();
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        if(isTouching(Pemeran_Utama.class)){
            eaten();
        }
        if(Tampilan_Darah.value==0){
            getWorld().removeObject(this);
        }
        
    }
}
