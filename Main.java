import java.io.*;


/** 
 
 * @author Somya Khatri 
 * @version 1.0
 * @param a - first numeric value for the addNumbers operation
 * @param b - second numeric value for the addNumbers operation
 * @param c - first numeric value for the subtractNumbers operation
 * @param d - second numeric value for the subtractNumbers operation
 * @return sum of two numbers
 * @return difference of two numbers
*/

public class Main {

    
    
    /** 
     * @param a
     * @param b
     * @return int
     */
    public int addNumbers(int a, int b) {
      int sum = a + b;
      return sum;
    }

    
    /** 
     * @param c
     * @param d
     * @return int
     */
    public int subtractNumbers(int c, int d) {
        int diff = c - d;
        return diff;
    }
  
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
      
      int num1 = 25;
      int num2 = 15;
  
      
      Main obj = new Main();
      int result_1 = obj.addNumbers(num1, num2);
      System.out.println("Sum is: " + result_1);
      int result_2 = obj.subtractNumbers(num1, num2);
      System.out.println("Diff is: " + result_2);
    }
  }