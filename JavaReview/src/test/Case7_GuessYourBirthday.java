package test;

import java.util.Scanner;

public class Case7_GuessYourBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  * 思路说明：一个月有31天，因此这里可以用一个五位的二进制数来表示31天（本质上是一颗二叉树）
  * 每次询问其实都是确定其中某一个二进制位是0还是1
  * 五次询问即可确定
  */
	Scanner scanner=new Scanner(System.in);
	int[] choice=new int[5];
	int sum=0;
	System.out.println("欢迎来到阿拉丁世界，让我来猜一猜你的生日吧！");
	//先确定最低位是否为0
	System.out.println("以下的日期有你的生日吗？\n"
			+"2 4 6 8\n"
			+"10 12 14 16\n"
			+"18 20 22 24\n"
			+"26 28 30\n"
			+"有请输入0，否则输入1:");
	choice[0]=scanner.nextInt();
	
	System.out.println("以下的日期有你的生日吗？\n"
			+"1 4 5 8\n"
			+"9 12 13 16\n"
			+"17 20 21 24\n"
			+"25 28 29\n"
			+"有请输入0，否则输入1:");
	choice[1]=scanner.nextInt();
	
	System.out.println("以下的日期有你的生日吗？\n"
			+"1 2 3 8\n"
			+"9 10 11 16\n"
			+"17 18 19 24\n"
			+"25 26 27\n"
			+"有请输入0，否则输入1:");
	choice[2]=scanner.nextInt();
	
	System.out.println("以下的日期有你的生日吗？\n"
			+"1 2 3 4\n"
			+"5 6 7 16\n"
			+"17 18 19 20\n"
			+"21 22 23\n"
			+"有请输入0，否则输入1:");
	choice[3]=scanner.nextInt();
	
	System.out.println("以下的日期有你的生日吗？\n"
			+"1 2 3 4\n"
			+"5 6 7 8\n"
			+"9 10 11 12\n"
			+"13 14 15\n"
			+"有请输入0，否则输入1:");
	choice[4]=scanner.nextInt();
	sum=choice[0]*1+choice[1]*2+choice[2]*4+choice[3]*8+choice[4]*16;
	System.out.println("芝麻开门！你的生日是："+sum+" 号！");
	
	
	}

}
