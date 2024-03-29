package logic_Pro;

public class comapre_2_inter_no
{
public static void main(String[] args)
	{
	  int ar1[]= {10,20,30};
	  
	  int ar2[]= {40,50,60};	 
	  int ar3[]= {40,50,60};

	  System.out.println(java.util.Arrays.equals(ar1, ar2));
	  System.out.println(java.util.Arrays.equals(ar2, ar3));
	  System.out.println(java.util.Arrays.equals(ar1, ar3));

	}
}



