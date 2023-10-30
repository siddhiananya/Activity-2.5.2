/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  private String name;
  private int points;
  
  public Player(){
    System.out.println("Enter player name:");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    points = 0;
    System.out.println("Hello and welcome to the game, " + name);
  }
  public Player(String inputName){
    inputName = name;
    points = 0;

    System.out.println("Hello and welcome to the game, " + name);
  }
  /* your code here - attributes */

  /* your code here - constructor(s) */ 

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}