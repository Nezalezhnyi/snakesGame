import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    private int prevX;
    private int prevY;
    private int prevRot;
    private Snake leader = null;
    public boolean worldStopped = false;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addLeader(Snake s)
    {
        leader = s; 
    }
    public void act()
    {
       Slither();
    }
    
    public void  Slither()
    {
       prevX = getX();
       prevY = getY();
       if (leader !=null)
       {
           setLocation(leader.prevX, leader.prevY);
           setRotation(leader.prevRot);
       }
       
    }
}
