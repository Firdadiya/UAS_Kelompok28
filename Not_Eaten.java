import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Not_Eaten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Not_Eaten extends Actor
{
    /**
     * Act - do whatever the Not_Eaten wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void cetakbaru();
    abstract void maju();
    
    void eaten(){
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
            Tampilan_Darah.add(-1);
            eaten();
        }
        if(Tampilan_Darah.value==0){
            getWorld().removeObject(this);
        }
    }
}
