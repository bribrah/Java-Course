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
  
  /** 
   * Takes a picture that and substitutes pixels that are predominantly green and at at least a certain level of green
   * that is given by the parameter passed
   */
  public void chromakeyGreen(int thresholdGreen, Picture source)
  {
    //creating variables
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    int sourceRed,sourceGreen,sourceBlue,targetGreen,targetBlue, targetRed;
    
    //for loops to go through each pixel of both the source and target Picture.=
    for (int sourceX = 0, targetX = 0; targetX < this.getWidth() && sourceX < source.getWidth(); targetX++, sourceX++)
    {
      for (int sourceY = 0, targetY = 0; targetY < this.getHeight() && sourceY < source.getHeight(); targetY++, sourceY++)
      {
        //setting pixels to correct pixels of each picture
        sourcePixel = source.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        
        //getting color values
        sourceRed = sourcePixel.getRed();
        sourceGreen = sourcePixel.getGreen();
        sourceBlue = sourcePixel.getBlue();
        targetGreen = targetPixel.getGreen();
        targetRed = targetPixel.getRed();
        targetBlue = targetPixel.getBlue();
        
        //if green is the most domonant color in the pixel AND the pixel has a green value of at least the parameter passed THEN change
        //target pixel to that of the source pixel with same x and y coordinate.
        if (targetGreen > thresholdGreen && targetGreen > (targetBlue + 10) && targetGreen> (targetRed + 10)){
          targetPixel.setRed(sourceRed);
          targetPixel.setBlue(sourceBlue);
          targetPixel.setGreen(sourceGreen);
        }
      }
    }
  }
  
  /** 
   * Takes a picture that and substitutes pixels that are predominantly blue and at at least a certain level of blue
   * that is given by the parameter passed
   */
  public void chromakeyBlue(int thresholdBlue, Picture source)
  {
    //creating variables
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    int sourceRed,sourceGreen,sourceBlue,targetGreen,targetBlue, targetRed;
    
    //for loops to go through each pixel of both the source and target Picture.=
    for (int sourceX = 0, targetX = 0; targetX < this.getWidth() && sourceX < source.getWidth(); targetX++, sourceX++)
    {
      for (int sourceY = 0, targetY = 0; targetY < this.getHeight() && sourceY < source.getHeight(); targetY++, sourceY++)
      {
        //setting pixels to correct pixels of each picture
        sourcePixel = source.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        
        //getting color values
        sourceRed = sourcePixel.getRed();
        sourceGreen = sourcePixel.getGreen();
        sourceBlue = sourcePixel.getBlue();
        targetGreen = targetPixel.getGreen();
        targetRed = targetPixel.getRed();
        targetBlue = targetPixel.getBlue();
        
        //if green is the most domonant color in the pixel AND the pixel has a green value of at least the parameter passed THEN change
        //target pixel to that of the source pixel with same x and y coordinate.
        if (targetBlue > thresholdBlue && targetBlue > (targetGreen + 8) && targetBlue> (targetRed + 8)){
          targetPixel.setRed(sourceRed);
          targetPixel.setBlue(sourceBlue);
          targetPixel.setGreen(sourceGreen);
        }
      }
    }
  }

  
} // this } is the end of class Picture, put all new methods before this
 