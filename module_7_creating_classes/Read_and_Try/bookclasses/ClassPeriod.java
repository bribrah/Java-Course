public class ClassPeriod
{
  //////////// fields //////////////
  private String teacherName;
  private int periodNumber;
  private Student[] studentArray = new Student[35];
  
  /////////// constructors ////////////
  
  /**
   * no argument constructor 
   * sets the fields to defaults.
   */
  public ClassPeriod() {}
  
  /**
   * constructor that takes only teacher name
   * @param name The name for the techer
   */
  
  public ClassPeriod(String name) {this.teacherName = name;};

/**
 * Contructor that takes teacher name and period
 * @param name The name for the teacher
 * @param number The period number
 */
public ClassPeriod(String name, int number) 
{
  this.teacherName = name;
  this.periodNumber = number;
}

///////// methods ////////////

/**
 * method to get the teacher name
 * @return the name of the teacher, or null if there is none
 */
public String getTeacherName() {return teacherName;}

/**
 * method to get the period number
 * @return the period number
 */
public  int getPeriodNumber() {return periodNumber;}

/**
 * method to return the student based on index passed
 * @param index The index to get the student from
 * @return the student at this index or null if no student at this index
 */
public Student getStudent(int index) {return studentArray[index];}

/**
 * method to set teacher name
 * @param name the new teacher name
 */
public void setTeacherNamer(String name)
{
  this.teacherName = name;
}

/**
 * method to set the period number if it has not been set yet
 * @param number the number to set the period to
 * @return true if success else failed
 */
public boolean setPeriod(int number)
{
  if (this.periodNumber == 0){
    this.periodNumber = number;
    return true;
  }
  else{
    return false;
  }
}

/**
 * method to set the student at an index
 * @param studentObj the student object indert at the index
 * @param index the index where to insert the student
 */
public void setStudent(Student studentObj, int index)
{
  this.studentArray[index] = studentObj;
}





}