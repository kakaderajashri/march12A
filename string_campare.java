package logic_Pro;

public class string_campare
{
	public static void main(String[] args)
	{
		String s1="ABCD";
		String s3="EFGO";
		String s2=new String("XYZO");
		String s4="ABCD";
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
	}

}
