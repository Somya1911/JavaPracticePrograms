import java.util.*;
import java.lang.Math; 
public class Monthly_payment {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the principal amount, Rate of Interest and Time period");
    double payment;
    double p=sc.nextDouble();
    double r=sc.nextDouble();
    int t= sc.nextInt();
    payment=p*Math.exp(r*t);
    System.out.println("The monthly payment to be done is:" + payment);
}
}

