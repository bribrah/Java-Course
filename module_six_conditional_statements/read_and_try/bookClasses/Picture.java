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
  
  public void purpleSky()
  {
    Color sky = new Color(103,157,191);
    Color purple = new Color(126,27,135);
    Pixel pixels[] = this.getPixels();
    Pixel pixel = null;
    for (int i = 0; i < pixels.length; i++)
    {
      pixel = pixels[i];
      if (pixel.colorDistance(sky) < 75.0)
      pixel.setColor(purple);
    }
  }
  public void edgeDetection(double amount)
  {
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    double topAverage = 0.0;
    double bottomAverage = 0.0;
    int endY = this.getHeight() - 1;
    for (int y = 0; y < endY; y++)
    {
      for (int x = 0; x < this.getWidth(); x++)
      {
        topPixel = this.getPixel(x,y);
        bottomPixel = this.getPixel(x, y+1);
        topAverage = (topPixel.getRed() + topPixel.getGreen() + topPixel.getBlue()) / 3;
        bottomAverage = (bottomPixel.getRed() + bottomPixel.getGreen() + bottomPixel.getBlue()) / 3;
        if (Math.abs(topAverage - bottomAverage) < amount)
        {
          topPixel.setColor(Color.WHITE);
        }
        else
        {
          topPixel.setColor(Color.BLUE);
        }
      }
    }
  }
  public void triColor()
  {
    Pixel pixel = null;
    int red = 0;
    int green = 0;
    int blue = 0;
    for (int x = 0; x < this.getWidth(); x++)
    {
      for (int y = 0; y < this.getHeight(); y++)
      {
        pixel = this.getPixel(x , y);
        red = pixel.getRed();
        green = pixel.getGreen();
        blue = pixel.getBlue();
        if (red > green && red > blue){
          pixel.setColor(Color.RED);
        }
        else if (green > red && green > blue){
          pixel.setColor(Color.GREEN);
        }
        else{
          pixel.setColor(Color.BLUE);
        }
      }
    }
  }
  //* takes prevalent color and makes the pixel that color
  public void fiveColor()
  {
    Pixel pixel = null;
    int red = 0;
    int green = 0;
    int blue = 0;
    for (int x = 0; x < this.getWidth(); x++)
    {
      for (int y = 0; y < this.getHeight(); y++)
      {
        pixel = this.getPixel(x , y);
        red = pixel.getRed();
        green = pixel.getGreen();
        blue = pixel.getBlue();
        if (red > green && red > blue){
          pixel.setColor(Color.RED);
        }
        else if (red > green && blue > green){
          pixel.setColor(Color.MAGENTA);
        }
        else if (green > red && green > blue){
          pixel.setColor(Color.GREEN);
        }
        else if (green > red && blue > red){
          pixel.setColor(Color.CYAN);
        }
        else if (green > blue && red > blue){
          pixel.setColor(Color.YELLOW);
        }
        else{
          pixel.setColor(Color.BLUE);
        }
      }
    }
  }
  
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
  
  public void exchange()
  {
    Pixel pixelArray[] = this.getPixels();
    Pixel p = null;
    Pixel q  = null;
    int pRed;
    int pBlue;
    int pGreen;
    for (int i = 0; i < pixelArray.length - 1; i+=2)
    {
      p = pixelArray[i];
      q = pixelArray[i + 1];
      
      pRed = p.getRed();
      pBlue = p.getBlue();
      pGreen = p.getGreen();
      
      p.setRed(q.getRed());
      p.setGreen(q.getGreen());
      p.setBlue(q.getBlue());
      
      q.setRed(pRed);
      q.setGreen(pGreen);
      q.setBlue(pBlue);
    }
  }
   
    

  
} // this } is the end of class Picture, put all new methods before this
 