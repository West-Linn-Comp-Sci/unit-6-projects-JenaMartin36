
/**
 * Abstract class Employee - write a description of the class here
 *
 * Jena Martin
 * 5/20/2021
 */
public abstract class Employee
{
    protected static final double BASE_WAGE = 10.0;
    
    protected String name;
    protected int age;
    protected double hoursWorked;
    protected boolean atWork;
    
    protected Employee (String name, int age) {
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;
    }
    
    public String getName() { 
        return name; 
    }
    
    public int getAge() { 
        return age; 
    }
    
    public boolean isAtWork() { 
        return atWork; 
    }
    
    public double getHoursWorked() { 
        return hoursWorked; 
    }
    
    public void logHoursWorked(double hours) {
        hoursWorked += hours;
    }
    
    public void startWork(double hours) {
        atWork = true;
        logHoursWorked(hours);
    }
    
    public void leaveWork() {
        atWork = false;
    }
    
    public double computeWage() {
        return (hoursWorked * BASE_WAGE);
    }
}
