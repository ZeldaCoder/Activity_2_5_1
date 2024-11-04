/*
 * Activity 2.5.2
 * By Jedediah Muthalaly, Gavin Katz
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private String solvedPhrase;
  private Player p1;
  private Player p2;
  private Board gameBoard;

  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    Player player1 = new Player();
    Player player2 = new Player();

    p1 = player1;
    p2 = player2;

    Board gB = new Board();

    gameBoard = gB;
  }
  /* your code here - accessor(s) */
  public Player getP1() {
    return p1;
  }
  
  public Player getP2() {
    return p2;
  }
  
  public Board getGameBoard() {
    return gameBoard;
  }
  
  /* your code here - mutator(s)  */
  public void setP1(Player player) {
    p1 = player;
  }
  
  public void setP2(Player player) {
    p2 = player;
  }
  
  public void setGameBoard(Board board) {
    gameBoard = board;
  }

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}