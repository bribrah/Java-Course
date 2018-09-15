/*
 * Filename: ColorSubtraction.java
 * Name:Brian Espinosa
 *
 * Date:9/5/2018
 *
 * Description: This class is designed to remove a specified amount of red blue and/or green from a picture
 *
 */

public class ColorSubtraction
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
       Picture myPicture = new Picture(FileChooser.pickAFile());
       Picture copy = new Picture(myPicture);
       copy.subtractColor(50,100,50);
       myPicture.explore();
       copy.explore();
       
    }
}