package logic_Pro;

import java.util.Scanner;

public class Uper_case_lowercase
{
    public static void main(String[] args) 
    {
    	int lower =0;
    	int upper=0;
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the String:");
    
         String 	str=scan.nextLine();
         
         for(int i=0;i<str.length();i++)
         {
        	 char ch=str.charAt(i);
        	 
        	 if(ch>='A' && ch<='Z')
        	 {
        		 upper++;
        		 
        	 }
        	 else if(ch>='a' && ch<='z')
        	 {
        		 lower++;
        	 }
         }
         System.out.println("Lowercase letters:"+lower);
         System.out.println("uppercase letter:"+upper);
   }

}
