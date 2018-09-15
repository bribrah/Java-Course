import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
import java.awt.Color;
// resolves problem with java.awt.List and java.util.List

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
  
  //creates a begative effect for a specified start and end of pixels in a picture
  
  public void negative(int start, int end)
  {
    //creating variables etc.
    Pixel pixelArray[] = this.getPixels();
    int index = start;
    Pixel currentPixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    while (index < end)
    {
      currentPixel = pixelArray[index];
      
      //get current colors
      int red = currentPixel.getRed();
      int green = currentPixel.getGreen();
      int blue = currentPixel.getBlue();
      
      //change colors to negative
      currentPixel.setRed(255-red);
      currentPixel.setGreen(255-green);
      currentPixel.setBlue(255-blue);
      
      //increment index
      index += 1;
    }
  }
  
  //makes image grey depending on the average intensity of each pixel
  public void grayscale(int start, int end)
  {
    Pixel pixelArray[] = this.getPixels();
    int index = start;
    Pixel pixel = null;
    int intensity = 0;
    while (index < end){
      pixel = pixelArray[index];
      int red = pixel.getRed();
      int  green = pixel.getGreen();
      int blue = pixel.getBlue();
      intensity = (red + green + blue) / 3;
      pixel.setColor(new Color(intensity,intensity,intensity));
      index+=1;
    }
  }
   /*Swaps the color values of each pixel
    * red value becomes blues value
    * blue becomes green
    * green becomes red
    */
  public void swapColor(int start, int end)
  {
    Pixel pixelArray[] = this.getPixels();
    int red = 0;
    int green= 0;
    int blue = 0;
    int index = start;
    Pixel pixel = null;
    while (index < end)
    {
      pixel = pixelArray[index];
      red = pixel.getRed();
      blue = pixel.getBlue();
      green = pixel.getGreen();
      pixel.setRed(blue);
      pixel.setBlue(green);
      pixel.setGreen(red);
      index += 1;
    }
  }
  
      
     
           
} // this } is the end of class Picture, put all new methods before this
 