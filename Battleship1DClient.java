
/**
 * Plays battleship game.
 *
 * Jena Martin
 * 5/7/2021
 */
import java.util.Scanner;
public class Battleship1DClient
{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        Battleship1D battleship = new Battleship1D();
        boolean kill = false;
        
        while (kill == false) {
            System.out.println("Enter your guess(0-6): ");
            int guess = input.nextInt();
            
            System.out.println(battleship.checkGuess(guess));
            kill = battleship.checkKill();
        }
        
        System.out.println("\n You sunk the ship!!!");
    }
}
