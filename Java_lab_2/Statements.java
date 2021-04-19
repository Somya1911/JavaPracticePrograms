import java.io.*; 
class Statements{
  public static void main(String args[]){
	  try{
		Double d = new Double( "1E6" );
		System.out.println("Double: "+d);
	  }
	  catch(NumberFormatException e){
		System.out.println("Not a suitable format");
		System.out.println(e);
	  }
	  try{
		Integer i = new Integer( "1_000_000" );
		System.out.println("Integer: "+i);
	  }
	  catch(NumberFormatException e){
		System.out.print("Not a suitable format! ");
		System.out.println(e);
	  }
	  try{
		Boolean b = new Boolean("true");
		System.out.println("Boolean: "+b);
	  }
	  catch(NumberFormatException e){
		System.out.println("Not a suitable format");
		System.out.println(e);
	  }
	  try{
		Character c = new Character('A');
		System.out.println("Character: "+c);
	  }
	  catch(NumberFormatException e){
		System.out.println("Not a suitable format");
		System.out.println(e);
	  }
  }
}