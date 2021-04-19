import java.io.*;
public class Validity
{
 public static void main(String[] args)
 {
	int valid=0;
	int invalid=0;
	for(int i=0;i<args.length;i++){
		try{
			int k = Integer.parseInt(args[i]);
            System.out.println("Valid number at "+ i +" "+ args[i]);
			valid++;
  
		}
		catch(NumberFormatException e){
			System.out.println("Invalid number at "+ i+" "+ args[i]);
			invalid++;
		}
	}
    System.out.println("Invalid Entries: "+ invalid);
	System.out.println("Valid Entries: "+ valid);
	
	
 }
}