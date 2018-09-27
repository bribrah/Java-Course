/**
 * this class is meant to store the data associated with the participant in a study
 */
public class Participant
{
  ////////////// fields ////////////
  private String name;
  private int weight;
  private double height;
  
  ////////// constructors //////////
  /**
   * constructor that takes no arguments
   * sets fields to the following default values 
   * name: "Joe Schmoe"
   * weight: 200
   * height: 6.0
   */
  public Participant() 
  {
    this.name = "Joe Schmoe";
    this.weight = 200;
    this.height = 6.0;
  }
  
  /**
   * constructor that takes only the name of the participant and sets 
   * the others fields to their default values
   * @param name the name of the particpiant
   */
  public Participant(String name)
  {
    this.name = name;
    this.weight = 200;
    this.height = 6.0;
  }
  
  /**
   * constructor that takes name, height, and weight of the particpant
   * if param of height or weight is negative, it will set respective field to its default value
   * @param name the name of the participant
   * @param weight the wight of the participant
   * @param height the height of the particpant
   */
  public Participant(String name, int weight, double height)
  {
    this.name = name;
    if (weight > 0){
      this.weight = weight;
    }
    else{
      System.out.println("Incorrect weight, weight must be positive. Weight will be set to default value (200).");
      this.weight = 200;
    }
    if (height > 0){
      this.height = height;
    }
    else{
      System.out.println("Incorrect height, height must be positive. Height will be set to default value (6.0).");
      this.height = 6.0;
    }
  }
  
  /////////////////// methods /////////////////////////
  
  /**
   * getter for partipants name
   * @return The name of the partipant assosciated with this partipant object
   */
  public String getName() {return this.name;}
  
  /**
   * getter for partipants weight
   * @return The weight of the participant associated with this participant object
   */
  public int getWeight() {return this.weight;}
  
  /**
   * getter for participants height
   * @return The height of the participant associated with this participant object
   */
  public double getHeight() {return this.height;}
  
  /**
   * setter for name
   * @param name The name to set this partipant object to
   */
  public void setName(String name) {this.name = name;}
  
  /**
   * setter for weight
   * sets weight of participant if parameter is above 0 if below 0 prints
   * failed message
   * @param weight The weight to change the participant obj weight to
   * @return message that tells whether change was succesful or not
   */
  public String setWeight(int weight)
  {
    if (weight > 0){
      this.weight = weight;
      return "Participant weight changed";
    }
    else{
      
      return "Incorrect weight, weight must be positive. Weight will not be updated";
    }
  }
  /**
   * setter for height
   * sets height of participant if parameter is above 0
   * @param height The height to change the particpant obj height to
   * @return message that tells whether change was succesful or not
   */
  public String setHeight(double height)
  {
    if (height > 0){
      this.height = height;
      return "Participant height changed";
    }
    else{
      return "Incorrect height, height must be positive. Height will not be updated.";
    }
  }
  
  /**
   * method that prints the participants details
   *@return The particpants details
   */
  public String toString()
  {
    return "\nParticipant:\nName: " + this.name + "\nWeight: " + this.weight + 
      "\nHeight: " + this.height;
  }
  
  /**
   * method that gives the participants BMI
   * @return The particpants BMI
   */
  public double  getBMI()
  {
    double BMI = (this.weight / (this.height * this.height)) * 703;
    return BMI;
  }
  
  
  
  
  
}  