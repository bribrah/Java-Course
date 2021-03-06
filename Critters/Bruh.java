import java.awt.Color;
import java.util.Random;
public class Bruh extends Critter
{
  ////////////constructors///////////
  public Bruh() {}
  
  ////////////methods////////////
  
  //sets the way it looks to a red BRUH
  public Color getColor(){return Color.RED;}
  public String toString(){return "BRUH";}
  
  /**
   * will eat only once
   * this is to prevent sleeping behavior
   */
  int amountEaten = 0;
  public boolean eat(){
    if (amountEaten < 1){
      amountEaten++;
      return true;}
    else {return false;}
  }
  
  /**
   * basically just does the counter attack to any of the other critters
   * @param opponent the string of the opponent that it is interacting with
   */
  public Attack fight(String opponent)
  {
    if (opponent == "B"){
      return Attack.ROAR;
    }
    else if (opponent == "L"){
      return Attack.SCRATCH;
    }
    else if (opponent == "0"){
      return Attack.SCRATCH;
    }
    else{
      return Attack.ROAR;
    }
  }
 /**
  * moves in a random direction for 5 turns then
  * changes diections and moves that direction for 5 turns
  */
  Random rand = new Random();
  int direction = rand.nextInt(4);
  int turn = 0;
  public Direction getMove(){
    if (turn % 5 == 0){
      direction = rand.nextInt(4);
    }
    if (direction == 1){
      turn++;
      return Direction.NORTH;
    }
    else if (direction == 2){
      turn++;
      return Direction.WEST;
    }
    else if (direction == 0){
      turn++;
      return Direction.EAST;
    }
    else{
      turn++;
      return Direction.SOUTH;
    }
  }
    
    
    
    
    
    
    
    
    
}