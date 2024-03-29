package logic_Pro;

public class ReverseEachWordIn_statement2 
{
	public static void main(String[] args) 
	{
		String s1="My name is ABC";
		
		String [] ar=s1.split("");
	        String rev="";
			for(int j=s1.length()-1;j>=0;j--)
			{
				rev=rev+s1.charAt(j);
			}
			System.out.println("Reverse String :"+rev);
			
		}
}
