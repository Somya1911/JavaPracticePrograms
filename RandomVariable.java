import java.util.*;
public class RandomVariable{
public static void main(String args[]){
int minimum=0,maximum=1;
final float pi=3.14f;
double u=Math.random();
double v=Math.random();
System.out.println("The vaue of u : "+u+" The vaue of u : "+v);
double random=((Math.sin(2*3.14f*v))*(Math.pow((-2*Math.log(u)),0.5)));
System.out.println("Gaussian random number is : "+random);
}
}