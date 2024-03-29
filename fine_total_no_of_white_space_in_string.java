package logic_Pro;

public class fine_total_no_of_white_space_in_string 
{
	public static void main(String[] args) {
		
	
	String str="R Aj shri";
	int count=0;
	
	for(int i=0;i<=str.length()-1;i++)
	{
	    char str1=str.charAt(i);
	    if(str ==" ")
	    {
	    	count++;
	    }
	}
	System.out.println("Number of spaces in given String :"+count);
}
}
			

 

