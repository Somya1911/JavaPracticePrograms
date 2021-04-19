import java.io.*;
public class QuestionFour {
    public static void main(String[] args) throws IOException {
        int a,b;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        }
        
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage( ));
        }
        
}
}