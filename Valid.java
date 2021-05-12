class Valid
{ 
    public static void main (String[] args) 
    { 
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter: ");
        String str= sc.nextLine(); 
        
        try 
        { 
             
            Integer.parseInt(str); 
            System.out.println(str + " is a valid integer number"); 
        }  
        catch (NumberFormatException e)  
        { 
            System.out.println(str + " is not a valid integer number"); 
        } 
          
        try 
        { 
            Integer.parseInt(str); 
            System.out.println(str + " is a valid integer number"); 
        }  
        catch (NumberFormatException e) 
        { 
            System.out.println(str+ " is not a valid integer number"); 
        } 
    } 
}