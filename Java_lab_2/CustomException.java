import java.util.Scanner;//To take user input here
class SumCustomException extends Exception
{
 String msg;
 SumCustomException(String msg)
 {
 this.msg=msg;
 }
}
interface IDemo
{
 int sum(int x,int y) throws SumCustomException;
}
class DemoClass implements IDemo
{
 public int sum(int x,int y) throws SumCustomException
 {
 int sumofIntegers=x+y;
 if(sumofIntegers<=100)
 {
 return sumofIntegers;
 }
 else
 {
 throw new SumCustomException ("Sum is greater than 100");
 }
 }
}
public class CustomException {
 public static void main(String args[])
 {
 
 Scanner in= new Scanner(System.in);
 int number1,number2;
 System.out.println("Enter first integer");
 number1=Integer.parseInt(in.nextLine());
 System.out.println("Enter second integer");
 number2=Integer.parseInt(in.nextLine());
 DemoClass demo=new DemoClass();
 try
 {
 int result=demo.sum(number1, number2);
 System.out.println("Sum of the numbers is "+ result);
 }
 catch(SumCustomException e)
 {
 System.out.println( "Caught the custom exception : "+e);
 e.printStackTrace();
 }
 }
}