/* Filename: PSA2.java
 *
 * Created by: Brian Espinosa
 *
 * Date:9/5/2018
 */
public class PSA2
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main(String[] args)
    {
      //make a solid picture
      Picture myPicture = new Picture(FileChooser.pickAFile());
      myPicture.createSolid(120,180,60);
      myPicture.explore();
  
      //make a striped picture
      myPicture.createPattern(150,30,180);
      myPicture.explore();

    }
}
