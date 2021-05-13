
/**
 * Write a description of class ArrayPractice2D here.
 *
 * Jena Martin
 * 5/12/2021
 */
public class Array2DExplorer
{
     public int minRow (int[][] nums, int row) {
        //looks through each element of the chosen row and returns 
        //the smallest integer from that row.
        int min = nums[row][0];
     
        for(int i=0; i<nums.length; i++ ) {
            if(nums[row][i] < min) {
                min = nums[row][i];
            }
        }
        return min;
    }
    
    public int[] colMaxs (int[][] matrix) {
        //searches through each column of an array and returns
        //an array with the largest integer from each column.
        int[] maxArr = new int[matrix[0].length];
        for(int i = 0; i < matrix[0].length; i++ ) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            maxArr[i] = max;
        }
        return maxArr;
    }
    
    public int[] allRowSums (int[][] data) {
        //calculates the row sum for every row and returns each of the values in an array. 
        //Index i of the return array contains the sum of elements in row i.
        int[] Arr = new int[data.length];
        for(int i = 0; i < data.length; i++ ) {
            int sum = 0;
            for (int j = 0; j < data[0].length; j++) {
                sum += data[i][j];
            }
            Arr[i] = sum;
        }
        return Arr;
    }
    
    public double[] averageCol (int[][] nums) {
        //calculates the average of each column in the array nums, 
        //and returns those values in an array of doubles.
        double[] avgArr = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++ ) {
            double sum = 0;
            double avg = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j][i];
                avg = sum/nums.length;
            }
            avgArr[i] = avg;
        }
        return avgArr;
    }
    
    public int smallEven (int[][] matrix) {
        //finds and returns the smallest even number in the array matrix. 
        //Assume that the array is filled with only positive ints.
        int min = 0;
        for(int i = 0; i < matrix.length; i++ ) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < min && min % 2 == 0) {
                    min = matrix[i][j];
                }
            }
       }
       return min;
    }
    
    public static int biggestRow (int[][] nums) {
        //returns the row index number that has the greatest sum of its elements.
        int maxSum = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++ ) {
            int sum = 0;
            
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
            if(maxSum < sum) {
                    maxSum = sum;
                    maxIndex = i;
                }
        }
        return maxIndex;
    }
}
