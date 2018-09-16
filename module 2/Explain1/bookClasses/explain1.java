/*
 * Filename: explain1.java
 *
 * Authors:
 *  1) Brian Espinosa
 *
 * Date:8/29/2018
 *
 */
import java.awt.*; //imports the methods needed to describe color
public class explain1
{
  //The line below is magic, you don't have to understand it (yet)
  public static void main (String[] args)
  {
    World w  = new World(500,500); //creates the world with height of 500 pixels and width of 500 pixels
    Turtle bob = new Turtle(w); //creates a new turtle with name bob in world w
    
//    //Next 3 lines are making and naming the colors that can be used later
//    //Color method works by using the (red,green,blue) method where each color can be specified up to a max value of 255
    
    Color red = new Color (255,0,0);
    Color green = new Color(0,255,0);
    Color blue = new Color(0,0,255);
    
//    //Movement methods
    
    bob.forward(200); //will move bob forward x pixels
    bob.backward(100);//makes bob move in opposite direction of heading x pixels
    bob.turnRight(); //turns bob 90 degrees to the right
    bob.turnLeft(); //turns bob 90 degrees left
    bob.turn(30); //turns bob x degrees in bob.turn(x) where negative values turn left and positive right
    bob.moveTo(250,250); //move bob to a set (x,y) point
    bob.setHeading(180); //sets heading of bob to x value wheres 0 is north
    
//    //pen methods
    
    bob.setPenWidth(5); //changes pen width to x pixels
    bob.penUp(); //stops pen from tracing
    bob.forward(50);
    bob.penDown(); //makes pen trace again
    
//    //change color methods
    
    bob.setColor(red); // changes pen color and turtle color to the color red that was created earlier
    bob.forward(100);
    
//    //using constants to make shapes
    
//    bob.penUp();
//    bob.moveTo(250,100); //moves bob to where I want to start the shape
//    //bob.penDown();
//    int sides = 8;//#of sides you want your shape 
//    int sideLength = 100; //sets a constant side length
//    int shapeAngle = 360 / sides; //calculates the angle needed in order to complete the shape
    
//    //while method to make shape
    
//    while (sides > 0){
//      bob.forward(sideLength);
//      bob.turn(shapeAngle);
//      sides -= 1;}
    
    
  }
}
    
    
 
  