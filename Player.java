
import java.util.Scanner;

/*
 * Activity 2.5.2
 * By Jedediah Muthalaly, Gavin Katz
 * A Player class the PhraseSolverGame
 */

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;

  /* your code here - constructor(s) */
  public Player() {
    System.out.println("Enter Player Name: ");
    Scanner scr = new Scanner(System.in);
    String newName = scr.nextLine();

    name = newName;
    System.out.print("Welcome to the game " + name);
  }

  public Player(String inputName) {
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