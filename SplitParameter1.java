package logic_Pro;

public class SplitParameter1
{
	public static void main(String[] args) 
	{
		String s1="My name is abcd";
		
		String []ar=s1.split("");
		
		System.out.println(ar[2]);
		
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]);
		}
		
	}

}
