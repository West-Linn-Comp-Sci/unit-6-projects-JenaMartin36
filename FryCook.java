
/**
 * Write a description of class sdklfj here.
 *
 * Jena Martin
 * 5/20/2021
 */
public class FryCook extends Employee{

    public static final double FRYCOOK_WAGE = 5.50;
    
    private BurgerByte workBranch;
    private boolean isGrillReady;

    public FryCook(String name, int age, BurgerByte workBranch) {
        super(name, age);
        this.workBranch = workBranch;
        isGrillReady = false;
        workBranch.addStaff(this);
    }
    
    public BurgerByte getWorkPlace() {
        return workBranch;
    }

    public boolean isGrillReady() { 
        return isGrillReady; 
    }

    public void startWork(double hours) {
        isGrillReady = true;
        atWork = true;
        logHoursWorked(hours);
        System.out.println("Grill is ready to cook with!");
    }

    public void leaveWork() {
        isGrillReady = false;
        atWork = false;
        System.out.println("Grill is closed for the day.");
    }

    public double computeWage() {
        return (hoursWorked * (FRYCOOK_WAGE + BASE_WAGE));
    }

}