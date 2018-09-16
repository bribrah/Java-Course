public class readandtry
{
   public static void main (String[] args)
   {
     Picture myPicture = new Picture (FileChooser.pickAFile());
     myPicture.explore();
     myPicture.posterize(6);
     myPicture.explore();
   }
}