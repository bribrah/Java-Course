public class Student
{
  
  ///////////////// fields ///////////////////
  private String name;
  private double[] gradeArray;
  
  ///////////////constructors////////////
  public Student() {}
  public Student(String theName)
  {
    this.name = theName;
  }
  
  public Student(String theName, double theGradeArray[])
  {
    this.name = theName;
    this.gradeArray = theGradeArray;
  }
  
  
  /////////////methods/////////////////
  public String toString()
  {
    return "Student object named : " + this.name;
  }
  
  public 
  
}