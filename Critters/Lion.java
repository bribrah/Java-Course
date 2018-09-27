import java.awt.Color;
public class Lion extends Critter
{
  ////////////contructors ///////////////
  public Lion() {}
  
  
  /////////// Methods //////////////
  
  public Color getColor() { return Color.RED;}
  
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
  
  public String toString(){return "L";}
  
  
  
  
  
  
  
  
  
  
  
}
