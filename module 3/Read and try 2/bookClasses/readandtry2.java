/*
 * Filename: readandtry.java
 *
 * Authors:
 *  1) Brian Espinosa
 *
 * Date:8/29/2018
 *
 */
public class readandtry2
{
   public static void main (String[] args)
   {
     World w = new World();
     Turtle a = new Turtle(w);
     Turtle b = new Turtle(w);
     Turtle c = new Turtle(w);
     Turtle d = new Turtle(w);
     Turtle e = new Turtle(w);
     
     a.drawPolygon(5,50);
     b.drawPolygon(4,100);
     c.drawPolygon(12,60);
     d.drawPolygon(6,90);
     e.drawPolygon(20,50);
     a.hide();
     b.hide();
     c.hide();
     d.hide();
     e.hide();
     
   }
}