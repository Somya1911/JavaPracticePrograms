public class QuestionTwo
{
  public static void main (String[]args)
  {
      int i = args.length;
    try
    {
      String myString[] = new String[i];

      if (myString[0].equals ("Java"));
        System.out.println ("First word is Java !");

        
    }
    catch (ArithmeticException e)
    {
      System.out.println (e);
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println (e);
    }
    catch (Exception e)
    {
      System.out.println (e);
    }
    
    System.out.println (" Number of arguments = " + i);

      int x = 18;

      int y[] = { 555, 999 };

      y[i] = x;
  }
}