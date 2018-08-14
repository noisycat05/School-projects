import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    public static int Score;
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        consume();
    }    
    
    public void moveAndTurn(){
        move(4);
        if(Greenfoot.isKeyDown("Left")){
            turn(4);
        }
        if(Greenfoot.isKeyDown("Right")){
            turn(-4);
        }
    }
    
    public void consume() {
        Actor leaf = getOneObjectAtOffset(0,0,Leaf.class);
        MyWorld world = (MyWorld) getWorld();
        if(leaf != null) {
            Score = Score+1;
            Greenfoot.playSound("eating.wav");
            world.removeObject(leaf);
        }
    }
}
