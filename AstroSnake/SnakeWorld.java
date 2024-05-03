import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SnakeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(40, 30, 30); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        SnakeHead snakeHead = new SnakeHead();
        addObject(snakeHead,19,12);
        Apples apples = new Apples();
        addObject(apples,13,10);
    }
    
    public void GameOver()
    {
        addObject(new OhNo(), 19, 14);
        showText("Game Over", 14, 12);
        int size = getObjects(Snake.class).size();
        showText("Snake Length: " + size, 14, 14);
    }
}

