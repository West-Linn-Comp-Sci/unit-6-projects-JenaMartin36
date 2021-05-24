
/**
 * Write a description of class childChild here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puppy extends Dog
{
    
    public Puppy(String type, String sound, int age, String breed) {
        super(type, sound, age, breed);
    }
    
    public void eat() {
        System.out.println("The puppy is eating wet food");
    }
    
    @Override
    public String toString() {
        return "I am a puppy";
    }
    
    public boolean equals (Animal x) {
        if (x.getAge() == age) {
            return true;
        }
        return false;
    }
}
