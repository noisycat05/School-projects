import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autowombo extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int neverMoveAgain = 0;
    private GreenfootImage image1 = new GreenfootImage("wombat.png");
    public void act() 
    {
        autoMove();
        consume();
    }    

    public void autoMove(){
        if(getImage().equals(image1)){
           move(0);
        }else{
        move(4);
    }
        if(Greenfoot.getRandomNumber(100) < 20) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            turn(180);
    
        }    
        if(getY() <= 5 || getY() >= getWorld().getWidth() - 5){
            turn(180);
    
        }
 }

 public void consume() {
        Actor leaf = getOneObjectAtOffset(0,0,Leaf.class);
        MyWorld world = (MyWorld) getWorld();
        if(leaf != null) {
            Greenfoot.playSound("eating.wav");
            world.removeObject(leaf);
        }
    }
}
