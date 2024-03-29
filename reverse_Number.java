package logic_Pro;

public class reverse_Number 
{
	public static void main(String[] args)
	{
		int orgnum=1234;
		
		String org=Integer.toString(orgnum);
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
		     rev=rev+org.charAt(i);
		}
		int revNum=Integer.parseInt(rev);   //convert String to number
		System.out.println(revNum);
	}

}
