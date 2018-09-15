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
  
  public void negative()
  {
    //creating variables etc.
    Pixel pixelArray[] = this.getPixels();
    int index = 0;
    Pixel currentPixel = null;
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;
    while (index < pixelArray.length)
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
  
  /*Swaps the color values of each pixel
   * red value becomes blues value
   * blue becomes green
   * green becomes red
   */
  public void swapColor()
  {
    Pixel pixelArray[] = this.getPixels();
    int red = 0;
    int green= 0;
    int blue = 0;
    int index = 0;
    Pixel pixel = null;
    while (index < pixelArray.length)
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
  //mirrors the picture on a vertical axis in the middle of the picture
  public void mirrorVertLR()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int halfway = this.getWidth() / 2;
    for (int x = 0; x < halfway; x++)
    {
      for(int y = 0; y < this.getHeight(); y++)
      {
        leftPixel = this.getPixel(x,y);
        rightPixel = this.getPixel(this.getWidth() - 1 -x, y);
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorVertRL()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int halfway = this.getWidth() / 2;
    for (int x = 0; x < halfway; x++)
    {
      for (int y = 0; y < this.getHeight(); y++)
      {
        leftPixel = this.getPixel(x,y);
        rightPixel = this.getPixel(this.getWidth() - 1 - x, y);
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  
  public void greyScale()
  {
    Pixel pixelArray[] = this.getPixels();
    int index = 0;
    int red = 0;
    int green = 0;
    int blue = 0;
    int average = 0;
    Pixel pixel = null;
    while (index < pixelArray.length)
    {
      pixel = pixelArray[index];
      red = pixel.getRed();
      green = pixel.getGreen();
      blue = pixel.getBlue();
      average = (red + green + blue) / 3;
      pixel.setRed(average);
      pixel.setBlue(average);
      pixel.setGreen(average);
      index++;
    }
  }
  
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
  
  
  
  
  
  //creates a collage on called object with the three pictures used as paramaters
  public void collage(Picture p1, Picture p2, Picture p3, Picture p4, Picture p5, Picture p6)
  {
    //creating variables
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    //adds first pic
    for (int sourceX = 0, targetX = 0; sourceX < p1.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = 0; sourceY < p1.getHeight(); sourceY++, targetY++){
        sourcePixel = p1.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    
    //adds second pic
    for (int sourceX = 0, targetX = p1.getWidth(); sourceX < p2.getWidth(); sourceX++, targetX++)
    {
      for(int sourceY = 0, targetY = 0; sourceY<p2.getHeight(); sourceY++, targetY++)
      {
        sourcePixel = p2.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    
    //adds third pic
    for (int sourceX = 0, targetX = p1.getWidth() + p2.getWidth(); sourceX<p3.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = 0; sourceY<p3.getHeight(); sourceY++, targetY++)
      {
        sourcePixel = p3.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    //adds fourth pic
    for (int sourceX = 0, targetX = 0; sourceX < p4.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = this.getHeight() / 2; sourceY < p1.getHeight(); sourceY++, targetY++){
        sourcePixel = p4.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    //adds fifth pic
    for (int sourceX = 0, targetX = p4.getWidth(); sourceX < p5.getWidth(); sourceX++, targetX++)
    {
      for(int sourceY = 0, targetY = this.getHeight() /2 ; sourceY<p2.getHeight(); sourceY++, targetY++)
      {
        sourcePixel = p5.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    //adds sixth pic
    for (int sourceX = 0, targetX = p4.getWidth() + p5.getWidth(); sourceX<p6.getWidth(); sourceX++, targetX++)
    {
      for (int sourceY = 0, targetY = this.getHeight() / 2; sourceY<p3.getHeight(); sourceY++, targetY++)
      {
        sourcePixel = p6.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    
    
  }
  
  
  
} // this } is the end of class Picture, put all new methods before this
