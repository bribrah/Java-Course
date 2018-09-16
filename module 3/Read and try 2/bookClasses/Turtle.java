import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }

 /*
? Method t o draw a s q u a r e w i t h a w i d t h and h e i g h t
? o f some p a s se d amount .
? @param w i d t h t h e w i d t h and h e i g h t t o use
*/
public void drawSquare(int width)
{
this.turnRight();
this.forward(width);
this.turnRight();
this.forward(width);
this.turnRight();
this.forward(width);
this.turnRight();
this.forward (width);
}
public void drawPolygon(int sides, int sidelength)
{
  int angle = 360/sides;
  while (sides > 0){
    this.forward(sidelength);
    this.turn(angle);
    sides -= 1;}
}
  
} // this } is the end of class Turtle, put all new methods before this