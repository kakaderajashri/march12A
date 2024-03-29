package logic_Pro;

public class imp_reverse_number_without_String_Function 
{
	public static void main(String[] args) 
	{
		
		 int num =112233;
		 int revNum=0;         //4321
		 
		                //321/10
		 for(int i=num;i>0;i=i/10)
		 {
			 int rem=i%10;        
			 revNum=revNum*10+rem;    //4320+1=4321
		 }
		 System.out.println(revNum);
	}

}
