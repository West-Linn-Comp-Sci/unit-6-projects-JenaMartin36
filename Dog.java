
/**
 * Write a description of class child here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    private String breed;
    
    public Dog(String type, String sound, int age, String breed) {
        super(type, sound, age);
        this.breed = breed;
    }
    
    public void eat() {
        System.out.println("The dog is eating dry food");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public String toString() {
        return "This animal is a " + super.getType() + ", the sound it makes is " + 
        super.getSound() + ", it is " + super.getAge() + " years old and it is a " + breed;
    }
    
    public boolean equals (Animal x) {
        if (age == x.getAge()) {
            return true;
        }
        return false;
    }
}
