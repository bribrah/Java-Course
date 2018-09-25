/* Filename: PSA4A.java
 * Name: Brian Espinosa
 *
 * Date: 9/11/2018
 *
 * Description: make a simple collage that uses three different filter methods.
 */

public class SimpleCollage
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
      //creating picture and copies and calling unaltered pic
      Picture myPicture = new Picture(FileChooser.pickAFile());
      Picture copy1 = new Picture(myPicture);
      Picture copy2 = new Picture(myPicture);
      Picture copy3 = new Picture(myPicture);
      Picture copy4 = new Picture(myPicture);
      Picture copy5 = new Picture(myPicture);
      myPicture.explore();
      
      
      //creating blank page of correct specs to copy to
      
      int width = 3 * myPicture.getWidth();
      int height = 2 * myPicture.getHeight();
      Picture blankPage = new Picture(width,height);
      
      //applying methods
      myPicture.negative();
      copy1.swapColor();
      copy2.mirrorVertRL();
      copy3.greyScale();
      copy4.colorAddition(30,60,100);
      copy5.mirrorVertLR();
      
      //calling collage
      blankPage.collage(myPicture, copy1, copy2, copy3, copy4, copy5);
      blankPage.explore();
      
      
      //writing pic
      blankPage.write("./collage_hoodoos.jpg");
      
      
    }
}

