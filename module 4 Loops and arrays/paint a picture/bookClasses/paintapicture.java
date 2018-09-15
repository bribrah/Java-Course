/*
 * Name = Brian Espinosa
 * 
 * date = 9/5/2018
 * 
 * file name = paintapicture.java
 */

public class paintapicture
{
  public static void main (String[] args){
    
  //make a solid picture
  Picture myPicture = new Picture(FileChooser.pickAFile());
  myPicture.createSolid(120,180,60);
  myPicture.explore();
  
  //make a striped picture
  myPicture.createPattern(100,100,100);
  myPicture.explore();
  
  
  }
  
}
