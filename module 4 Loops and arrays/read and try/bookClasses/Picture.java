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
  
  //decreased red value of all pixels in a picture by half
  
  public void decreaseRed()
  {
    Pixel[] pixelArray = this.getPixels();
    int value = 0;
    //loops through all pixels in the created array
    for (Pixel pixelObj : pixelArray)
    {
      //get red value of pixel
      value = pixelObj.getRed();
      
      //decrease red value by half
      value = value / 2;
      
      //set red value back to pixel
      pixelObj.setRed(value);
    }
  }
   public void decreaseBlue()
      {
        Pixel[] pixelArray = this.getPixels();
        int value = 0;
        for (Pixel pixel : pixelArray)
        {
          value = pixel.getBlue();
          value = value /2;
          pixel.setBlue(value);
        }
      }
   
   /*Swaps the color values of each pixel
    * red value becomes blues value
    * blue becomes green
    * green becomes red
    */
   
   public void colorSwap()
   {
     Pixel[] pixelArray = this.getPixels();
     int red = 0;
     int blue = 0;
     int green = 0;
     for (Pixel pixel : pixelArray)
     {
       int redValue = pixel.getRed();
       int blueValue = pixel.getBlue();
       int greenValue = pixel.getGreen();
       pixel.setRed(blueValue);
       pixel.setBlue(greenValue);
       pixel.setGreen(redValue);
     }
   }
   
  
     
} // this } is the end of class Picture, put all new methods before this
 