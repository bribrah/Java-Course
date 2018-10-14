import java.awt.Color;
public class Bear extends Critter
{
  ///////////// fields ///////////////
  public boolean grizzly;
  
  ////////////// constructors ///////////////
  public Bear(boolean grizzly) {this.grizzly = grizzly;}
  
  
  ///////////// methods /////////////
  /*
   * makes bear string color  brown if this .grizzly is true
   * else it makes the bar string white
   */
  public Color getColor()
  {
    if (this.grizzly == true)
    {
      return (new Color(190,110,50));
    }
    else{
      return Color.WHITE;
    }
  }
  
  /*
   * will always eat
   */
  public boolean eat() {return true;}
  
  /*will always attack with scratch*/
  public Attack fight(String opponent) { return Attack.SCRATCH;}
  
  /*
   * makes bear move in a north than west zigzag pattern
   */
  int moves = 0;
  public Direction getMove()
  {
    if (moves == 0){
      moves= moves + 1;
      return Direction.NORTH;
      
    }
    else if (moves == 1) {
      moves++;
      return Direction.WEST;
      
    }
    else if (moves % 2 == 0){
      moves++;
      return Direction.NORTH;
    }
    else{
      moves++;
      return Direction.WEST;
    }
  }
  
  /*makes bear string appear as a "B"*/
  public String toString() {return "B";}
  
  
}