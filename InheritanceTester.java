
/**
 * Write a description of class InheritanceTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceTester
{
    public static void main (String[] args) {
        Animal cat = new Animal("cat", "meow", 2);
        Dog kevin = new Dog("Dog", "Bark", 5, "Golden Retriever");
        Puppy spot = new Puppy("Puppy", "Yip", 1, "labrador");
        cat.makeSound();
        cat.birthday();
        System.out.println(cat.getAge());
        System.out.println(cat);
        kevin.eat();
        kevin.makeSound();
        kevin.setBreed("Austrailian Shepherd");
        System.out.println(kevin.getBreed());
        spot.eat();
        Animal rover = new Dog("Dog", "Bark", 7, "Bulldog");
        System.out.println(rover);
    }
}
