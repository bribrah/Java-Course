public class Chromakey
{
  public static void main (String[] args)
  {
    //create all pictures
    Picture greenScreen = new Picture("./GreenScreen.JPG");
    Picture mountain = new Picture("./mountainSmaller.jpg");
    Picture nebula = new Picture("./nebula.jpg"); //from "https://spaceplace.nasa.gov/nebula/en/"
    greenScreen.write("./Espinosa_ChromakeyBefore.jpg");
    
    
    //chromakey each picture
    greenScreen.chromakeyBlue(20,nebula);
    greenScreen.chromakeyGreen(80,mountain);
    
    //call images
    greenScreen.explore();
    greenScreen.write("./Espinosa_ChromaKeyAfter.jpg");
  }
}