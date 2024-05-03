import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeHead extends Snake
{
    /**
     * Act - do whatever the SnakeHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Snake end = null;
    
    

    
    
    public void act ()
    {
        if (!worldStopped)
        {
        Slither();
        checkKeys();
        move(1);
        ouch();
        eatApple();
        }
    }
    private void ouch()
    {
        if (getIntersectingObjects(SnakeTail.class).size()>=1)
        {
            worldStopped=true;
            ((SnakeWorld)getWorld()).GameOver();
        }
    }
    private void checkKeys()
    {
        int rot = getRotation();
        if ((end == null || rot!=90) && Greenfoot.isKeyDown("w"))
            setRotation(270);
        if ((end == null || rot!=270) && Greenfoot.isKeyDown("s"))
            setRotation(90);
        if ((end == null || rot!=0) && Greenfoot.isKeyDown("a"))
            setRotation(180);
        if ((end == null || rot!=180) && Greenfoot.isKeyDown("d"))
            setRotation(0);
    }
    private void eatApple()
    {
        Apples a1 = (Apples)getOneIntersectingObject(Apples.class);
        if (a1!=null)
        {
            a1.jump();
            Snake tail = new SnakeTail();
            getWorld().addObject(tail,getX(), getY());
            if (end == null)
                end = this;
            tail.addLeader(end);
            end = tail;
        }
    }
}
