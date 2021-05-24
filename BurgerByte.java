
/**
 * Write a description of class jds here.
 *
 * Jena Martin
 * 5/20/2021
 */
import java.util.ArrayList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private List<Employee> staff;
    private boolean isOpen;

    public BurgerByte(String locn, Manager m) {
        location = locn;
        manager = m;
        staff = new ArrayList<>();
    }

    public String getLocation() { 
        return location; 
    }
    public Manager getManager() { 
        return manager; 
    }
    public List<Employee> getStaff() { 
        return staff; 
    }
    public boolean isOpen() { 
        return isOpen; 
    }
    
    public void openRestaurant() {
        isOpen = true;
    }
   
    public void closeRestaurant() {
        isOpen = false;
        for (Employee e : staff) {
            e.leaveWork();
        }
        manager.leaveWork();
    }

    public void addStaff(Employee e) {
        staff.add(e);
    }
    
    public void removeStaff(Employee e) {
        staff.remove(e);
    }
}    