/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  private Player player1; // Assuming Player is a class.
  private Player player2;
  private Board board; // Assuming Board is a class.
  private boolean solved;
  
  public PhraseSolver(String player1Name, String player2Name){
    player1 = new Player(player1Name);
    player2 = new Player(player2Name);
    board = new Board();
    solved = false;
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