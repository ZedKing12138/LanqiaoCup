package test;

import java.util.Scanner;

import com.sun.webkit.ThemeClient;

public class BitOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner1=new Scanner(System.in);
		int number=0b10101010101010101010101010101010;
		int bitNum;
		int result;
		System.out.print("continue Or Quit ?");
		while(scanner1.next()!="quit") 
		{
		int mask=1;
		System.out.print("enter bitNum(0~31): ");
		bitNum=scanner1.nextInt();
		mask=mask<<bitNum;
		 result=(number&mask)>>bitNum;
		System.out.println("the "+bitNum+" bit of "+number+" is "+result);
		System.out.println(Integer.toBinaryString(number));
		System.out.print("continue Or Quit ?");	
			
			
		}
		
		
	}

}
