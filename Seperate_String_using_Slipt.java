package logic_Pro;

public class Seperate_String_using_Slipt 
{
	public static void main(String[] args) 
	{
		String s1="JAVA,SELENIUM,Testing,Maven";
		
		String [] ar=s1.split(",");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");	
		}
		
		
	//	for(int i=ar.length-1;i>=0;i--)  //reverse order
		//{
	//		System.out.print(ar[i]+" ");	
	//	}
	
	}

}
