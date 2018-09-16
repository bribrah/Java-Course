/*
 * Filename: DrawShape.java
 *
 * Authors:
 *  1) Brian Espinosa
 *
 * Date:9/01/2018
 *
 */
public class DrawShape
{
  public static void main (String[] args){
    World w = new World(600,600);
    Turtle a = new Turtle(w);
    Turtle b = new Turtle(w);
    Turtle c = new Turtle(w);
    Turtle d = new Turtle(w);
    
    //getting turtles into position
    
    b.penUp();
    c.penUp();
    d.penUp();
    b.moveTo(275,300);
    c.moveTo(250,300);
    d.moveTo(225,300);
    b.penDown();
    c.penDown();
    d.penDown();
    
    //making stars
    
a.drawStar(5,100);
    
  }
}
    
    