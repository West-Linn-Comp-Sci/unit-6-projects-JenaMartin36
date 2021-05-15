
/**
 * Write a description of class rdik here.
 *
 * Jena Martin
 * 5/13/2021
 */ 
public class Coin { 
 
    private double myValue; 
    private String myName; 
 
    public Coin(double value, String name) { 
        myValue = value; 
        myName = name; 
    } 
 
    public double getValue() { 
        return myValue; 
    } 
 
    public String getName() { 
        return myName;
    } 
 
    public boolean equals(Coin aCoin) { 
        boolean result = false;
        if (myValue == aCoin.getValue() && myName.equals(aCoin.getName())) {
            result = true;
        }
        return result;
    }
} 
