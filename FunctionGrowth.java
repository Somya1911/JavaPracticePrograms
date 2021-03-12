import java.util.*;
import java.lang.Math; 
public class FunctionGrowth
    {
        public static void main(String[] args) 
        {
            double n;
            double a;
            for(n=16 ; n<=2048 ; n=n*2)
            {
                a=Math.log(n);
                System.out.println(a + "\t" + n + "\t" + (n*a) + "\t" + (n*n) + "\t" + (n*n*n) + "\t" + (2*n));
            }
        }
    }
