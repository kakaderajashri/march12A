package logic_Pro;

public class prme_number
{

	  public static void main(String[] args) {

	    int num = 12, i = 2;
	    boolean flag = false;
	    while (i <= num / 2)  //2<=12/2   2<=2
	    {
	      // condition for nonprime number
	      if (num % i == 0)  //12%2==0  0==0
	      {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	    {
	    	
	     System.out.println(num + " is a prime number.");
	    }
	    else
	    {
	      System.out.println(num + " is not a prime number.");
	    }
	  }
	}
