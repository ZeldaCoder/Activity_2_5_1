/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;

  /* your code here - constructor(s) */
  Player(String inputName) {
    name = inputName;
    points = 0;

    System.out.print("Welcome " + name);
  } 

  /* your code here - accessor(s) */ 
  int getPoints() {
    return points;
  }

  String getName() {
    return name;
  }

  /* your code here - mutator(s) */ 
  void setPoints(int newPoints) {
    points = newPoints;
  }
}