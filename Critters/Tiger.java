import java.awt.Color;
import java.util.Random;
public class Tiger extends Critter
{
  ////////////constructors////////
  public int hunger;
  
  /*
   * sets tiger strings color to yellow
   */
  public Tiger(int hunger) { this.hunger = hunger;}
  
  
  ////////////methods///////////
  public Color getColor() {return Color.YELLOW;}
  
  /*
   * Returns eat if the tigger has not yet eaten as much as its hunger value
   */
  int numEaten = 0;
  public boolean eat()
  {
    if (numEaten < this.hunger){
      numEaten++;
      return true;
    }
    else{
      return false;
    }
  }
  
  /*
   * Returns Scratch if tiger has not yet eaten as much food as its hunger value
   * else it return pounce
   * @param the string of the opponent it is interacting with
   */
  
  public Attack fight(String opponent)
  {
    if (numEaten < this.hunger){
      return Attack.SCRATCH;
    }
    else{
      return Attack.POUNCE;
    }
  }
  
  /*
   * moves the tiger in a random direction for 3 turns and then
   * changes the direction to another random direction
   */
  int turn = 0;
  Random rand = new Random();
  int direction = rand.nextInt(4);
  public Direction getMove(){
    if (turn % 3 == 0){
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
  
  /*
   * makes the tigers appearence looks like the number of food it can still eat
   * also known as its hunger
   */
  public String toString()
  {
    return Integer.toString(this.hunger - numEaten);
  }
}
    