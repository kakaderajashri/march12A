package logic_Pro;

public class reverse_string 
{
	public static void main(String[] args)
	{
		String s1="I am from Mumbai";
		String rev ="";
		
		String [] ar=s1.split(" ");
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
	}

}
