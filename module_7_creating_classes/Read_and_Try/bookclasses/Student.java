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
  
  //////////accesors///////////////////
  public String getName() { return this.name;}
  
  public double getGrade(int index)
  {
    return this.gradeArray[index];
  }
  
  ////////////modifiers//////////////////
  public boolean setGrade(int index, double newGrade)
  {
    if (newGrade < 0 || this.gradeArray == null){
      return false;
    }
    else{
      this.gradeArray[index] = newGrade;
      return true;
    }
  }
  public boolean setGradeArray(double gradeArray[])
  {
    if (this.gradeArray != null){
      return false;
    }
    else{
      this.gradeArray = gradeArray;
      return true;
    }
  }
  
  /////////////methods/////////////////
  public Double getAverage()
  {
    double average = 0.0;
    
    if (this.gradeArray != null && this.gradeArray.length > 0){
      double sum = 0.0;
      for (int i =0; i < this.gradeArray.length; i++)
      {
        sum = sum + this.gradeArray[i];
      }
      average = sum / this.gradeArray.length;
    }
    return average;
  }
  
  public String  toString()
  {
    return "Student object named : " + this.name + "\nAverage Grade: " + this.getAverage();
  }
}
