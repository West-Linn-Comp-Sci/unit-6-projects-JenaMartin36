
/**
 * Write a description of class dksjf here.
 *
 * Jena Martin
 * 5/20/2021
 */
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    public static final double MANAGER_WAGE = 9.50;
    
    private BurgerByte managingBranch;
    private List<Employee> team;

    public Manager(String name, int age) {
        super(name, age);
        hoursWorked = 0;
        atWork = false;
        team = new ArrayList<>();
    }

    public BurgerByte getManagingBranch() { 
        return managingBranch; 
    }
    
    public List<Employee> getTeam() {
        return team;
    }
    
    public void startWork(double hours) {
        managingBranch.openRestaurant();
        atWork = true;
        logHoursWorked(hours);
        System.out.println("We are open for the day!");
    }

    public void leaveWork() {
        managingBranch.closeRestaurant();
        atWork = false;
        System.out.println("We are closed for the day!");
    }

    public double computeWage() {
        return (hoursWorked * (MANAGER_WAGE + BASE_WAGE));
    }
    
    public void setManagingBranch(BurgerByte managingBranch) {
        this.managingBranch = managingBranch;
    }
    
    public void hire(Employee e) {
        managingBranch.addStaff(e);
        team.add(e);
        System.out.println("Welcome aboard, " + e.getName() + "!");
    }

    public void fire(Employee e) {
        managingBranch.removeStaff(e);
        team.remove(e);
        System.out.println("Sorry to let you go, " + e.getName() + ".");
    }
}