public class main
{
  public static void main (String[] args)
  {
    double briansGrades[] = {80.0,67.8,88.9,55.8};
    double mariasGrades[] = {90,75,88.8,10, 98.9};
    Student brian = new Student("Brian Espinosa", briansGrades);
    Student maria = new Student("Maria Gonzales", mariasGrades);
    ClassPeriod cisc190 = new ClassPeriod("Tasha Frankie", 3);
    cisc190.setStudent(brian,0);
    cisc190.setStudent(maria,1);
    System.out.println("Cisc 190's Teacher is: " + cisc190.getTeacherName());
    System.out.println("It's period number is: " + cisc190.getPeriodNumber());
    System.out.println(cisc190.getStudent(0));
    System.out.println(cisc190.getStudent(1));
    
  }
}