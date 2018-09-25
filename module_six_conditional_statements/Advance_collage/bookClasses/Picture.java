import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  public static void main(String[] args) 
  {
    String fileName = FileChooser.pickAFile();
    Picture pictObj = new Picture(fileName);
    pictObj.explore();
  }
  /**was trying to make a method that could take an old pixture and smooth out the creases and things, 
    * could not get it to work and gave up :( 
    */
  
  
//  public void mendPicture()
//  {
//    Pixel pixel1, pixel2, pixel3, pixel4, mainPixel,pixelA,pixelB;
//    Boolean changed = false;
//    int avgR,avgB,avgG;
//    for (int y = 4;  y<this.getHeight()-4; y++)
//    {
//      for (int x = 8;  x < this.getWidth()-8;  x+=2)
//      {
//        mainPixel = this.getPixel(x,y);
//        int a = x;
//        int b = x;
//        while (x - a > 50 && !changed);
//        changed = false;
//        {
//          pixelA = this.getPixel(a,y);
//          pixelB = this.getPixel(b,y);
//          if ((mainPixel.colorDistance(pixelA.getColor()) < 5 || mainPixel.colorDistance(pixelB.getColor()) < 5 || pixelA.colorDistance(pixelB.getColor()) > 10))
//          {
//            a--;
//            b++;
//          }
//          else
//          {
//            avgR = (pixelA.getRed() + pixelB.getRed()) / 2;
//            avgG = (pixelA.getGreen() + pixelB.getGreen()) / 2;
//            avgB = (pixelA.getBlue() + pixelB.getBlue()) / 2;
//            mainPixel.setRed(avgR);
//            mainPixel.setBlue(avgB);
//            mainPixel.setGreen(avgG);
//            changed = !changed;
//          }
//        }
//      }
//    }
//  }
  
  
  /**Takes the bright colors in a picture and negatives them
    * but leaves the dark colors the way they were.
    * Cutoff brightness is based on parameter given
    */
  public void negativeBrighterThan(int averageCutoff){
    
    //getting pixel array to work on and making pixel variable
    Pixel pixelArray[] = this.getPixels();
    Pixel pixel = null;
    
    //initializing integer variable
    int red, green, blue, average;
    int i = 0;
    
    //while loop to go through pixels in array
    while (i < pixelArray.length)
    {
      
      //setting pixel to index and getting color values
      pixel = pixelArray[i];
      red = pixel.getRed();
      green = pixel.getGreen();
      blue = pixel.getBlue();
      
      //finding the average color (ie:brightness) of color
      average = (red + green + blue) / 3;
      
      //if brightness is above parameter given then negatives and increments
      if (average > averageCutoff){
        pixel.setRed(255 - red);
        pixel.setGreen(255 - green);
        pixel.setBlue(255 - blue);
        i++;
      }
      //else it just increments
      else{
        i++;
      }
    }
  }
  /** posterizes the picture which means it changes the colors to only have 
    * a certain amount of each color
    * amount of color is based on parameter passed
    */
  public void posterize(int level)
  {
    Pixel pixel = null;
    int red = 0;
    int green = 0;
    int blue = 0;
    int increment = (int) (256/level);
    int bottom, middle, top = 0;
    for (int x = 0; x < this.getWidth(); x++)
    {
      for (int y = 0; y < this.getHeight(); y++)
      {
        pixel = this.getPixel(x,y);
        red = pixel.getRed();
        green = pixel.getGreen();
        blue = pixel.getBlue();
        
        for (int i = 0; i < level; i++)
        {
          bottom = i * increment;
          top = (i + 1) * increment;
          middle = (int) ((bottom + top - 1)/2);
          if (red >= bottom && red < top){
            pixel.setRed(middle);
          }
          if (green >= bottom && red < top){
            pixel.setGreen(middle);
          }
          if (blue >= bottom && blue < top){
            pixel.setBlue(middle);
          }
        }
      }
    }
  }
  
  /** attempted to make a filter that take brighter and darker colors and makes them more in the middle but
    * the effect didnt really look very good
    */
//  public void equalize()
//  {
//    Pixel pixelArray[] = this.getPixels();
//    Pixel pixel = null;
//    int red,green,blue,differenceRed,differenceGreen,differenceBlue,averageDifference;
//    int i = 0;
//    while (i < pixelArray.length)
//    {
//      pixel = pixelArray[i];
//      red = pixel.getRed();
//      blue = pixel.getBlue();
//      green = pixel.getGreen();
//      differenceRed = 128 - red;
//      differenceBlue = 128 - blue;
//      differenceGreen = 128 - blue;
//      averageDifference = (differenceRed + differenceBlue + differenceGreen) / 3;
//      if (averageDifference > 50 || averageDifference < -50 ){
//        pixel.setRed(red + (differenceRed / 3));
//        pixel.setBlue(blue + (differenceBlue / 3));
//        pixel.setGreen(green + (differenceGreen /3));
//        i++;
//      }
//      else{
//        i++;
//      }
//    }
//  }
  
  public void colorAddition(int r,int g,int b)
  {
    Pixel pixelArray[] = this.getPixels();
    Pixel currentPixel = null;
    int red = 0;
    int green = 0;
    int blue = 0;
    int index = 0;
    while (index < pixelArray.length)
    {
      currentPixel = pixelArray[index];
      red = currentPixel.getRed();
      green = currentPixel.getGreen();
      blue = currentPixel.getBlue();
      currentPixel.setRed(red + r);
      currentPixel.setGreen(green + g);
      currentPixel.setBlue(blue + b);
      index++;
    }
  }
  
  
  public static Picture createCollage(Picture p1, Picture p2, Picture p3)
  {
    //for loop to find the picture with the largest height
    int pictureHeights[] = {p1.getHeight(), p2.getHeight(), p3.getHeight()};
    int maxHeight = pictureHeights[0];
    for (int i = 0; i < pictureHeights.length; i++)
    {
      if (pictureHeights[i] > maxHeight){
        maxHeight = pictureHeights[i];
      }
    }
    
    
    //making black template of correct dimensions to put pictures on
    Picture template = new Picture((p1.getWidth() + p2.getWidth() + p3.getWidth()), maxHeight + 1);
    Pixel templateArray[] = template.getPixels();
    Pixel templatePixel = null;
    for (int i = 0; i < templateArray.length; i++)
    {
      templatePixel = templateArray[i];
      templatePixel.setColor(Color.BLACK);
    }
      
    
    
    //initializing variables 
    Pixel sourcePixel, targetPixel;
    int red,green,blue;
    
    //for loop for adding first picture to collage
    for (int sourceX = 0, targetX = 0; sourceX < p1.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = (template.getHeight() - p1.getHeight()) /2; sourceY < p1.getHeight(); sourceY++, targetY++)
      {
        //getting pixels
        sourcePixel = p1.getPixel(sourceX,sourceY);
        targetPixel = template.getPixel(targetX,targetY);
        
        //getting colors of source
        red = sourcePixel.getRed();
        green = sourcePixel.getGreen();
        blue = sourcePixel.getBlue();
        
        //adding picture to collage
        targetPixel.setRed(red);
        targetPixel.setGreen(green);
        targetPixel.setBlue(blue);
      }
    }
    //for loop for second picture
    for (int sourceX = 0, targetX = p1.getWidth(); sourceX < p2.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = (template.getHeight() - p2.getHeight()) /2; sourceY < p2.getHeight(); sourceY++, targetY++)
      {
        //getting pixels
        sourcePixel = p2.getPixel(sourceX,sourceY);
        targetPixel = template.getPixel(targetX,targetY);
        
        //getting colors of source
        red = sourcePixel.getRed();
        green = sourcePixel.getGreen();
        blue = sourcePixel.getBlue();
        
        //adding picture to collage
        targetPixel.setRed(red);
        targetPixel.setGreen(green);
        targetPixel.setBlue(blue);
      }
    }
    //for loop for third picture
    for (int sourceX = 0, targetX = p1.getWidth() + p2.getWidth(); sourceX < p3.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = (template.getHeight() - p3.getHeight()) /2 ; sourceY < p3.getHeight(); sourceY++, targetY++)
      {
        //getting pixels
        sourcePixel = p3.getPixel(sourceX,sourceY);
        targetPixel = template.getPixel(targetX,targetY);
        
        //getting colors of source
        red = sourcePixel.getRed();
        green = sourcePixel.getGreen();
        blue = sourcePixel.getBlue();
        
        //adding picture to collage
        targetPixel.setRed(red);
        targetPixel.setGreen(green);
        targetPixel.setBlue(blue);
      }
    }
    return template;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
} // this } is the end of class Picture, put all new methods before this
