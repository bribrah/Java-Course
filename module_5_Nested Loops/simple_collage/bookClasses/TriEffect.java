/*
 * Filename: TriEffect.java
 * Name:
 *
 * Date:
 *
 * Description: This class is designed to...
 *
 */

public class TriEffect
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
      //pick a picture and create pixel array
      Picture myPicture = new Picture(FileChooser.pickAFile());
      Picture copy = new Picture(myPicture);
      Pixel pixelArray[] = myPicture.getPixels();
      
      //get an integer number of total pixels in the picture order to calculate the thirds
      int pixelAmount = pixelArray.length;
      
      //add effects
      copy.negative(0,(pixelAmount / 3));
      copy.grayscale(pixelAmount / 3,(int)(pixelAmount * 2/3));
      copy.swapColor((int)(pixelAmount * 2/3),pixelAmount);
      
      //call pictures to see
      copy.explore();
      myPicture.explore();
    }
}