import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        autoMove();
    }    

    public void autoMove(){
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            turn(180);
    
        }
        
        if(getY() <= 5 || getY() >= getWorld().getWidth() - 5){
            turn(180);
    
        }

        Actor wombat = getOneObjectAtOffset(0,0,Wombat.class);
        Actor autoWombo = getOneObjectAtOffset(0,0,Autowombo.class);
        if(wombat != null || autoWombo != null){
            if(wombat != null) {
            wombat.setImage("sandc.png");
            Greenfoot.stop();
            Greenfoot.playSound("failhorn.mp3");
        }
            if(autoWombo != null) {
            autoWombo.setImage("sandc.png");
            Greenfoot.playSound("failhorn.mp3");
        }
        }
 }
}
