package test;

public class Case1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 问题：给定一个整数，现需要将其奇偶位进行互换。
		 * 思路：利用掩码mask的与运算，分别提取出奇数位和偶数位，进行位移，再将两者相加即可。
		 */
		int num=-464656;
		System.out.println("原数的二进制表示为："+Integer.toBinaryString(num));
		int mask1=0b01010101010101010101010101010101;
		int mask2=mask1<<1;
		int oddBit=(num&mask1)<<1;
		int evenBit=(num&mask2)>>>1;
		int result=oddBit+evenBit;
		System.out.println("完成交换后的二进制表示为："+Integer.toBinaryString(result));
		
		
	}

}
