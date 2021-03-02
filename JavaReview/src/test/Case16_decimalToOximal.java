package test;

import java.util.Scanner;

public class Case16_decimalToOximal {
	
	public static String decimalToHexi_single(int decimalNum)
	{
	if(decimalNum>=0&&decimalNum<=9) {
		return Integer.toString(decimalNum);
	}
	else if (decimalNum>=10&&decimalNum<=15) {
		return String.valueOf((char)('A'-10+decimalNum));
	}
		return null;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		while(true) {
		System.out.println("请输入一个十进制的数字(正数)：");
		Scanner scanner=new Scanner(System.in);
		 num=scanner.nextInt();
		 if(num<0)
			 break;
		String string=new String();
		while(num!=0) {
			string=decimalToHexi_single(num%16)+string;
			num=num/16;
		}
		System.out.println("最终转化的十六制结果为："+string);
	}
		System.out.println("检测到负数的输入，终止程序！");
 }

}
