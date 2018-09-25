/* Filename: CreateMultipleShapes.java
 * Name:Brian Espinosa
 *
 * Date:9/10/2018
 *
 * Description: This class is designed to make multiple shapes based on user input given
 *
 */

// TODO: NEED TO FILL IN THE APPROPRIATE import STATEMENT HERE
import java.util.Scanner;
public class CreateMultipleShapes
{
  public static void main(String[] args)
  {
    /* Creating a World with one Turtle in it and initializing variables. */
    World w = new World(800,600);
    Turtle t = new Turtle(w);
    
    // TODO: FILL IN CODE TO CREATE A Scanner OBJECT CONNECTED TO System.in
    Scanner userInput = new Scanner(System.in);

    int xCoordinate, yCoordinate, sides, radLength;
    int shapeNumber = 1;
    
    // ask user for number of shapes to draw, and get response
    System.out.println("How many times do you want to draw the shape?");
    String strNumberShapes = userInput.nextLine();
    int numberShapes = Integer.parseInt(strNumberShapes);
    
    // TODO: NEED TO FILL IN THE FOR LOOP HERE
    for (int shapesLeft = numberShapes; shapesLeft>0; shapesLeft--, shapeNumber++)
    {
      System.out.println("Shape number " + shapeNumber);
      
      // get the x, y coordinates for where to draw the shape
      System.out.println("Enter the x-coordinate:");
      String strXCoordinate = userInput.nextLine();
      xCoordinate = Integer.parseInt(strXCoordinate);
      
      System.out.println("Enter the y-coordinate:");
      String strYCoordinate = userInput.nextLine();
      yCoordinate = Integer.parseInt(strYCoordinate);
      
      // get the size to draw the shape
      System.out.println("Enter how many sides(max of 30 please):");
      String strSides = userInput.nextLine();
      sides = Integer.parseInt(strSides);
      
      System.out.println("Enter radius of polygon:");
      String strRadLength = userInput.nextLine();
      radLength = Integer.parseInt(strRadLength);
      
      // move the turtle to the starting coordinates, without drawing a line
      t.penUp();
      t.moveTo(xCoordinate,yCoordinate);
      t.penDown();
      t.drawPolygon(sides,radLength);

    }
  }
}