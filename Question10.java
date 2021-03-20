import java.util.*;
import java.util.Arrays;
public class Question10
{
  int u=0;
  public int[] xor(int[] a,int[] b)
  {
      int d=0;
      int n=a.length+b.length;
      int dup[]=new int[n];
      int uni[]= new int[n];

     
    for(int i=0;i<a.length;i++) 
    {
        for(int j=0;j<b.length;j++)
        {
         if(a[i] == b[j])
         {
             dup[d]=a[i];
             d++;
         }
        }
    }
 
    
    for(int i=0;i<a.length;i++)
    {
        int e=1;
        for(int j=0;j<d;j++)
        {
            if(a[i] == dup[j])
                e=0;
        }
     if(e==1)
     {
         uni[u++]=a[i];
     }
    }

 
    for(int i=0;i<b.length;i++)
    {
        int e=1;
        for(int j=0;j<d;j++)
        {
            if(b[i] == dup[j])
                e=0;
        }
     if(e==1)
     {
         uni[u]=b[i];
         u++;
     }
    }

    return uni;
  }
  
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of two arrays");
        int n1=sc.nextInt();
        int n2=sc.nextInt(); 
        int[] x=new int[n1];
        int[] y=new int[n2];
        System.out.println("Enter input in 1st array");
        for(int i=0;i<n1;i++)
        {
           x[i]=sc.nextInt();
        }
         System.out.println("Enter input in 2nd array");
        for(int i=0;i<n2;i++)
        {
           y[i]=sc.nextInt();
        }

        arr ob=new arr();
        int[] result=ob.xor(x,y);
        Arrays.sort(result,0,ob.u);
        System.out.println("Elements are:");
        for(int i=0;i<ob.u;i++)
        {
        System.out.print(result[i]+"\t");
        }

	}
}