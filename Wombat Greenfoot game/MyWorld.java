import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Wombat w = new Wombat();
        addObject(w,300,200);
        
        Lobster l = new Lobster();
        addObject(l,100,150);
        
       for(int i = 0;i < 5000;i++){
           addObject(new Leaf(), Greenfoot.getRandomNumber(getWidth()-10),Greenfoot.getRandomNumber(getHeight()-10));
        }
       
    }
}
