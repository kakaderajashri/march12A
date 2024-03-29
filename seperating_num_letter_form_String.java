package logic_Pro;

import java.util.Scanner;

public class seperating_num_letter_form_String 
{
   public static void main(String[] args)
   {
	   int num=0;
	   String letter=0;
	   Scanner scan=new Scanner(System.in);
   	   System.out.println("Enter the String:");
   
        String 	str=scan.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
       	 char ch=str.charAt(i);
		  
		  if(ch>='a'&& ch<='z')
		  {
			  letter++;
		  }
		  else(ch<=1 && ch>=9)
		  {
			  num++;
		  }
		   
	   }
	   System.out.println("Letters:"+letter);
	   System.out.println("NUMBERS:"+num);
	}
}
