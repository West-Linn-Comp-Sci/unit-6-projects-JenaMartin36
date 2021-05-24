
/**
 * Write a description of class parent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    public String type;
    public String sound;
    public int age;
     
    public Animal (String type, String sound, int age) {
        this.type = type;
        this.sound = sound;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println(sound);
    }
    
    public void birthday() {
        age++;
    }
    
    public String getType() {
        return type;
    }
    
    public String getSound() {
        return sound;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        return "This animal is a " + type + ", the sound it makes is " + sound + ", and it is " + age + " years old";
    }
}
