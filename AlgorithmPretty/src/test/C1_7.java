package test;

import java.util.Arrays;

public class C1_7 {

	public static int getIntPart(double x) {
		return (int)x;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 问题：将一个0到1的double小数转化成相应的二进制形式，若位数超过32位，则提示error
		 * 思路：乘2取整，再减去整数，若为0则停止
		 */
		double num=0.0625/4;
		int count=0;
		char[] result=new char[32];
		while(num!=0&&count<32) {
			num=num*2;
			result[count]=(char)('1'-1+getIntPart(num));
			num=num-getIntPart(num);
			count++;
		}
		if(count==32) {
			System.out.println("error！");
		}
		else {
			System.out.println("最终的二进制表示为："+"0."+String.valueOf(result));
		}
	}

}
