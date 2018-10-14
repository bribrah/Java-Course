import java.awt.Color;
import java.util.Random;
public class Tiger extends Critter
{
  ////////////constructors////////
  public int hunger;
  
  public Tiger(int hunger) { this.hunger = hunger;}
  
  
  ////////////methods///////////
  public Color getColor() {return Color.YELLOW;}
  
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
  
  public Attack fight(String opponent)
  {
    if (numEaten < this.hunger){
      return Attack.SCRATCH;
    }
    else{
      return Attack.POUNCE;
    }
  }
  
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
  
  public String toString()
  {
    return Integer.toString(this.hunger - numEaten);
  }
}
    