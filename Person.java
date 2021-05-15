
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int myAge = 0;
    private String myName = "";
    public Person (int age, String name) {
        myAge = age;
        myName = name;
    }
    
    public int getAge() {
        return myAge;
    }
    
    public String getName() {
        return myName;
    }
}
