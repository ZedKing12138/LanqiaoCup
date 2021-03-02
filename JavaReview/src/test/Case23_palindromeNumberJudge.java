package test;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Case23_palindromeNumberJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("请输入你想要判断的字符串：");
			String string=scanner.next();
			if(string.equals("quit")) break;
			char[] str=string.toCharArray();
			boolean flag=true;
				for (int i = 0; i < string.length()/2&&flag==true; i++) {
					if(str[i]!=str[string.length()-1-i]) flag=false;
				}	
			if(flag==true) System.out.println("恭喜！这是一个回文字符串！");
			else if (flag==false) System.out.println("很抱歉，这并不是回文字符串哦！");
		}
			
		System.out.println("程序已成功退出！");	
		}
		
		
	}	


