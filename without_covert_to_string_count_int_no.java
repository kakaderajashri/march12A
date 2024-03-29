package logic_Pro;

public class without_covert_to_string_count_int_no
{
	public static void main(String[] args) 
	{
		int num=22555032;
		 int count = 0;
		
		 while (num != 0) 
		 {
		      // num = num/10
		      num =num/ 10;
		      count++;
		    }

		    System.out.println("Number of digits: " + count);
		  }
}
		