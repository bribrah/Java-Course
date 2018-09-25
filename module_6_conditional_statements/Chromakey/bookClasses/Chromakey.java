public class Chromakey
{
   public static void main (String[] args)
   {
     //create all pictures
     Picture greenScreen = new Picture("./GreenScreen.JPG");
     Picture mountain = new Picture("./mountainSmaller.jpg");
     Picture greenShirt = new Picture("./greenShirt.jpg"); //from "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwic8rGj99TdAhVbCTQIHS0bDb4QjRx6BAgBEAU&url=https%3A%2F%2Fwww.123rf.com%2Fphoto_39343593_portrait-of-overweight-man-wearing-green-shirt-baseball-cap-and-sunglasses-standing-in-studio-with-h.html&psig=AOvVaw3ciL0YOHDEg3ukQ3rHgwKb&ust=1537922337642966"
     Picture nebula = new Picture("./nebula.jpg"); //from "https://spaceplace.nasa.gov/nebula/en/"
     
     
     //call images before chromakey
     Picture collageBefore = Picture.createCollage(greenScreen,greenShirt, (new Picture(1,1)));
     
     //chromakey each picture
     greenScreen.chromakeyGreen(80,mountain);
     greenShirt.chromakeyGreen(50,nebula);
     Picture collageAfter = Picture.createCollage(greenScreen,greenShirt,(new Picture(1,1)));
     
     //call images
     collageBefore.explore();
     collageAfter.explore();
     collageBefore.write("./Espinosa_ChromakeyBefore.jpg");
     collageAfter.write("./Espinosa_ChromaKeyAfter.jpg");
   }
}