
/**
 * Write a description of class ArrayList here.
 *
 * Jena Martin
 * 5/13/2021
 */
import java.util.ArrayList;
public class ArrayList1
{
    public static void removeZeros(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    
    public static int countLetters(ArrayList<String> list) {
        int count = 0;
        for(String s : list) {
            count+= s.length();
        }
        return count;
    }
    
    public static int findPosition(int keyValue, ArrayList<Integer>myArray){
        int result = 0;
        for(int i = 0; i < myArray.size(); i++) {
            if(myArray.get(i) == keyValue) {
                result = i;
            }
            else {
                result = -1;
            }
        }
        return result;
    }
    
    public static ArrayList<String> parseIntoArrayList(String input) { 
        ArrayList<String> letters = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.substring(i,i + 1));
        }
        return letters;
    }
    
    public static String findMin(ArrayList<Person> list) {
        list.add(new Person(17,"Katie"));
        list.add(new Person(18,"Anika"));
        list.add(new Person(16, "Jena"));
        
        int min = list.get(0).getAge();
        int minPos = 0;
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i).getAge()){
                min = list.get(i).getAge();
                minPos = i;
            }
        }
        return list.get(minPos).getName();
    }
}
    
