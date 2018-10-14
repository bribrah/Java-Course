import java.awt.Color;
public class Lion extends Critter
{
  ////////////contructors ///////////////
  public Lion() {}
  
  
  /////////// Methods //////////////
  
  
  /*
   * sets color of Lion string to Red
   */
  public Color getColor() { return Color.RED;}
  
  /*
   * makes it so lion will only eat if it has fought
   * since the last time it has eaten
   */
  boolean hasFought = false;
  
  public boolean eat(){
    if (hasFought == true){
      hasFought = false;
      return true;
    }
    else {
      return false;
    }
  }
  
  /*
   * Lion will attack with Roar if opponent string is "B"
   * else it will pounce
   * @param opponent the oppenent that the lion is interacting with
   */
  public Attack fight(String opponent)
  {
    if (opponent == "B"){
      hasFought = true;
      return Attack.ROAR;
    }
    else{
      hasFought = true;
      return Attack.POUNCE;
    }
  }
  
  /*
   * makes it so Lion will move forward 5 turns then turn
   * right, efrectivey makes the lion move in a square pattern
   */
  int turn = 0;
  public Direction getMove()
  {
    if (turn< 5){
      turn++;
        return Direction.SOUTH;
    }
    else if (turn < 10) {
      turn++;
        return Direction.WEST;
    }
    else if (turn< 15) {
      turn++;
        return Direction.NORTH;
    }
    else if (turn< 19){
      turn++;
        return Direction.EAST;
    }
    else{
      turn  = 0;
      return Direction.EAST;
    }
  }
  
  /*
   * makes lion string appear as an "L"
   */
  public String toString(){return "L";}
  
  
  
  
  
  
  
  
  
  
  
}
