
/**
 * Write a description of class lsdjf here.
 *
 * Jena Martin
 * 5/20/2021
 */
public class Cashier extends Employee{

    public static final double CASHIER_WAGE = 6.50;
    
    private BurgerByte workBranch;
    private boolean isRegisterOpen;

    public Cashier(String name, int age, BurgerByte workBranch) {
        super(name, age);
        hoursWorked = 0;
        atWork = false;
        this.workBranch = workBranch;
        isRegisterOpen = false;
        workBranch.addStaff(this);
    }
     
    public BurgerByte getWorkPlace() { 
        return workBranch; 
    }
    
    public boolean isRegisterOpen() { 
        return isRegisterOpen; 
    }
    
    public void startWork(double hours) {
        isRegisterOpen = true;
        atWork = true;
        logHoursWorked(hours);
        System.out.println("Register open!");
    }

    public void leaveWork() {
        isRegisterOpen = false;
        atWork = false;
        System.out.println("Register closed, can't take any more orders.");
    }

    public double computeWage() {
        return (hoursWorked * (CASHIER_WAGE + BASE_WAGE));
    }
}