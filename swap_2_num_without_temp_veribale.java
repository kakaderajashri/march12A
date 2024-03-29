package logic_Pro;

import java.util.Scanner;

public class swap_2_num_without_temp_veribale
{
	public static void main(String[] args)
	{
	   
     int num1=20;
     int num2=30;
     
	   System.out.println("Enter Num before swapng:"+num1+"  "+num2);
	    num1=num1+num2;  //20=20+30  =50
	    num2=num1-num2;  //30=50-30  =20 
	    num1=num1-num2;  //50=50-20   =30  
	    
	    System.out.println("Enter Num before swapng:"+num1+"  "+num2);
	   
		
	}

}


