public class readandtry
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
      Picture myPicture = new Picture(FileChooser.pickAFile());
      myPicture.dickyDean(150,150);
      myPicture.explore();
    }
} 
      