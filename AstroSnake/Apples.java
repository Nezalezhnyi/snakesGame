import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apples extends Actor
{
    /**
     * Act - do whatever the Apples wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void jump()
    {
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),
        Greenfoot.getRandomNumber(getWorld().getHeight()));
    }
}
