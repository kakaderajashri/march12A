package logic_Pro;

public class ReverseEachWord_in_Satatement2 
{
	public static void main(String[] args) 
	{
		String s1="My name is abc";
		String []ar=s1.split("  ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			
			String rev="";
			
			for(int j=org.length()-1;j>=0;j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev);
			
		}
		
	}

}
