public class readandtry
{
   public static void main (String[] args)
   {
     Picture myPicture = new Picture (FileChooser.pickAFile());
     myPicture.explore();
     myPicture.posterize(3);
     myPicture.explore();
     myPicture.write("./zion.jpg");
   }
}