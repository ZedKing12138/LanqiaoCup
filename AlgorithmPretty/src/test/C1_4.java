package test;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

public class C1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 问题：给定一个整数，求其二进制表示中1的个数
		 */
		
		
		/*
		 * 思路1：通过mask与运算，求得各个位上到底是1还是0，并逐个计数即可
		 */
		int num=1351611;
		System.out.println(Integer.toBinaryString(num));
		int mask=1;
		int count=0;
		for (int i = 1; i <=32; i++) {
			if((num&mask)!=0) {
				count++;
			}
			mask=mask<<1;
		}
		System.out.println("总的1的个数为："+count);
		
		
		
		/*
		 * 思路2：每次减去1后，再和原数做与运算，则可以消除一个1（原数最低位上的1），如此重复，计算循环次数即可
		x=（x-1）&x
		 */
		count=0;
		while(num!=0) {
			num=(num-1)&num;
			count++;
		}
		System.out.println("总的1的个数为："+count);
	}

}
