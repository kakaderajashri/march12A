package logic_Pro;

public class main_method_overloadding 
{
    public static void main()
    {
    	System.out.println("Hi");
		
	}
    
   public static void main(String[] args)
   {
	   main_method_overloadding m1=new main_method_overloadding();
	   m1.main();
	   System.out.println("Hello");
	   
   }

}


