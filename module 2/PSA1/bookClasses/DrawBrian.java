/*
 * Filename: DrawBrian.java
 *
 * Authors:
 *  1) Brian Espinosa
 *
 * Date:8/23/2018
 *
 */
import java.awt.*;
public class DrawBrian
{
  //The line below is magic, you don't have to understand it (yet)
  public static void main (String[] args)
  {
    Color red = new Color(255,0,0);
    Color yellow = new Color(255,255,0);
    Color green = new Color (0,255,0);
    Color purple = new Color(102,0,204);
    World w = new World();
    Turtle brian = new Turtle(w);
    //Pen width Increase
    brian.setPenWidth(20);
     brian.penUp();
     brian.turnLeft();
     brian.forward(275);
     brian.turnRight();
     brian.forward(200);
     brian.backward(50);
     brian.setColor(red);
     brian.penDown();
     brian.backward(200);
     brian.turnRight();
     int x = 180;
     brian.turnLeft();
     brian.forward(200);
      brian.turnRight();
      //makes a half circle(or in theory it should but doesnt look very round for some reason)
      while (x>0){
        brian.forward(2);
        brian.turn(1);
        x -=1;}
      brian.turnRight();
      brian.turnRight();
      //had to use different variable but same method to make a circle(couldnt really figure out how to actually make a method)
      int y = 180;
       while (y>0){
        brian.forward(2);
        brian.turn(1);
        y -=1;}
       brian.turnRight();
       brian.forward(100);
       brian.penUp();
       brian.turnRight();
       brian.forward(100);
       brian.turnRight();
       brian.forward(100);
       brian.setColor(purple);
       brian.penDown();
       brian.backward(230);
       brian.turnLeft();
       int z=180;
       while (z>0){
         brian.forward(2);
         brian.turn(1);
         z -= 1;}
       brian.turn(235);
       brian.forward(130);
       brian.turn(305);
       brian.penUp();
       brian.forward(30);
       brian.turnLeft();
       brian.setColor(green);
       brian.penDown();
       brian.forward(230);
       brian.penUp();
       brian.turnRight();
       brian.forward(100);
       brian.turn(75);
       brian.setColor(purple);
       brian.penDown();
       brian.forward(250);
       brian.backward(250);
       brian.turn(30);
       brian.forward(250);
       brian.backward(250);
       brian.forward(100);
       brian.turn(255);
       brian.forward(50);
       brian.penUp();
       brian.forward(85);
       brian.turnLeft();
       brian.forward(80);
       brian.setColor(yellow);
       brian.penDown();
       brian.backward(220);
       brian.forward(220);
       brian.turn(150);
       brian.forward(255);
       brian.turn(210);
       brian.forward(220);
  }
}
