package test;

import java.util.Scanner;

public class Case6_0xscale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=0;
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while(i<100)
	{ 	i++;
		System.out.println("请输入数字0-15：");
		input=scanner.nextInt();
		if(input>=0&&input<=9)
			System.out.println("二进制表示为："+input);
		else if (input==10) 
			System.out.println("二进制表示为：A");
		else if (input==11) 
			System.out.println("二进制表示为：B");	
		else if (input==12) 
			System.out.println("二进制表示为：C");
		else if (input==13) 
			System.out.println("二进制表示为：D");
		else if (input==14) 
			System.out.println("二进制表示为：E");
		else if (input==15) 
			System.out.println("二进制表示为：F");
	}
		
 }

}
