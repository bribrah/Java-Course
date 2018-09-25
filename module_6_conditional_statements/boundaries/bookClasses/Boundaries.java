/*
 * Boundaries.java
 *
 * Name:Brian Espinosa
 *
 * Date:9/19/2018
 *
 * Description: This method prompts user and makes colored boxes based on answers to prompts.
 *
 */

import java.util.Scanner;
import java.awt.Color;

public class Boundaries
{
  public static void main(String[] args)
  {
    /* Connecting a Scanner object to the keyboard */
    Scanner keyboard = new Scanner(System.in);
    
    /* Choosing a picture and initializing variables. */
    Picture pic = new Picture(FileChooser.pickAFile());
    int x, y, width, height,red,green,blue;
    pic.show();
    int pictureWidth = pic.getWidth();
    int pictureHeight = pic.getHeight();
    String strPictureHeight = Integer.toString(pictureWidth);
    String strPictureWidth = Integer.toString(pictureHeight);
    System.out.println("Picture loaded - width: " + pictureWidth +" height: "+ pictureHeight);
    
    // Attempt to draw 3 boxes
    int boxesDrawn = 0;
    while (boxesDrawn < 3)
    {
    //creating prompts for future use
      
      String prompt = "Please enter the upper left corner (first x, then y) of ";
      String prompt2 = "the box to draw.";
      String prompt3 = "Values were out of bounds, please pick again";
      String prompt4= "For coordinates, please pick a range within: ";
      String prompt5 = "The max width you can pick is ";
      String prompt6 = "the max height you can pick is";
      String promptColor = "What color would you like your box to be?/nChoose red then green then blue values/nMaxvalue you can choose for each is 255";
      String wrongColor = "For color please choose a number between 0  and 255";
      
      //prompt user for coords
      System.out.println(prompt + prompt2);
      
      
      /* Converting coordinates to ints. */
      x = keyboard.nextInt();
      y = keyboard.nextInt();
      
      
      /* Prompting the user for width and height. */
      int maxWidth = pictureWidth - x;
      int maxHeight = pictureHeight - y;
      System.out.println("The max width you can choose is " + maxWidth + ".");
      System.out.println("Please enter the width of the box to flip.");
      width = keyboard.nextInt();
      
      System.out.println("The max height you can choose is" + maxHeight + ".");
      System.out.println("Please enter the height of the box to flip.");
      height = keyboard.nextInt();
      
      //prompt user for colors
      System.out.println(promptColor);
      red = keyboard.nextInt();
      green = keyboard.nextInt();
      blue = keyboard.nextInt();
      
      //if statement that restarts the while loop if any conditional statesments are true
      if ( x + width > pictureWidth || y + height > pictureHeight || x > pictureWidth|| y > pictureHeight || red > 255 || green > 255 || blue > 255
         || x < 0 || y < 0|| x + width < 0 || y + height< 0|| red < 0 || green < 0 || blue < 0){
        System.out.println(prompt3);
        
        System.out.println(prompt4 + "(" + strPictureWidth + "," + strPictureHeight + ")");
        System.out.println(wrongColor);
        continue;
      }
      
      //creates box with user's parameters
      else{
        Color boxColor = new Color(red,green,blue);
        pic.drawBoxAtOffset(x, y, width, height, boxColor);
        pic.repaint();
        
        boxesDrawn++;
      }
      
    }
  }
}