package test;

import java.util.Scanner;

public class Case21_RandomString {
	public static int RandomInt(int min,int max) {
		return min+(int)(Math.random()*(max-min+1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		int max=1<<16-1;
		
		int loop;
		while(true) {
		String string=new String();
		System.out.println("请输入你想生成的随机字符串的长度：");
		Scanner scanner=new Scanner(System.in);
		loop=scanner.nextInt();
		if(loop<=0)
			break;
		while(loop>0) {
			string+=String.valueOf((char)RandomInt(min, max));
			loop--;
		}
		System.out.println("本次生成的随机字符串为："+string);
		
	}
		System.out.println("程序顺利退出！");
 }		

}
