
/**
 * Write a description of class kerjdh here.
 *
 * Jena Martin
 * 5/13/2021
 */
import java.util.ArrayList;
public class Purse { 
    private ArrayList coins; 
 
    public Purse() { 
        coins = new ArrayList(); 
    }
 
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
 
    // returns total value of all coins in purse 
    public double getTotal() { 
        double total = 0;
        for (int i = 0; i < coins.size( ); i++) {
            Coin c = (Coin) coins.get(i);
            total += c.getValue( );
        } 
        return total;
    } 
 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int count = 0;
        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            if (c.equalsCoin(aCoin))  {
                count++;
            }
        }
        return count;
    } 
 
    // returns the name of the Coin in the Purse that has the smallest value 
    public String findSmallest(){
        double minVal = 0;
        String minName = "";
        for (int i = 0; i < coins.size(); i++) {
            Coin c = (Coin) coins.get(i);
            if (minVal < c.getValue()){
                minVal = c.getValue();
                minName = c.getName();
            }
        }
        return minName;
    }
     
}
