import java.util.*; 
public class Checkerboard {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++) {
            for(int j=0;j<n*2;j++)
            System.out.print((char)(32+(((i+j+1)%2)*10)));
            System.out.println();
        }
    }
}
