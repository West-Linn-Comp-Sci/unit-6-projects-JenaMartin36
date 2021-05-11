
/**
 * Creats a ship, a board, and methods to play the game.
 *
 * Jena Martin
 * 5/7/2021
 */
public class Battleship1D
{
    
    int[] grid = {0,1,1,1,0,0,0};
    public Battleship1D () {
        grid = this.grid;
    }
        
    public String checkGuess(int guess) {
        String result= "miss";
        
        if (grid[guess] == 1) {
            grid[guess] = 0;
            result = "hit";
        }
        
        return result;
    }
    
    public Boolean checkKill () {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i] == 1) {
                return false;
            }
        }
        return true;
    }
}
