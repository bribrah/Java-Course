/*
 * File Name = drawshapes
 * name = Brian Espinosa
 * date = 9/1/2018
 */

public class drawshapes
{
  public static void main (String[] args)
  {
    //making turtle and world
    World w = new World(600,600);
    Turtle a = new Turtle(w);
    Turtle b = new Turtle(w);
    Turtle c = new Turtle(w);
    Turtle d = new Turtle(w);
    
    //getting turtles into position
    b.penUp();
    c.penUp();
    d.penUp();
    b.moveTo(275,350);
    c.moveTo(250,400);
    d.moveTo(225,450);
    b.penDown();
    c.penDown();
    d.penDown();
    
    //making shapes
    a.drawShape(5,100);
    b.drawShape(5,200);
    c.drawShape(5,300);
    d.drawShape(5,400);
    
    //hide turtles
    a.hide();
    b.hide();
    c.hide();
    d.hide();
    
  }
}