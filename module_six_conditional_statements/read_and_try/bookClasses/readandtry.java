public class readandtry
{
   public static void main (String[] args)
   {
     Picture myPicture = new Picture (FileChooser.pickAFile());
     myPicture.explore();
     myPicture.exchange();
     myPicture.explore();
     myPicture.write("./zion.jpg");
   }
}