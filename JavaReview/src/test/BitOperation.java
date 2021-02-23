package test;

public class BitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = -125;
		int mask=0x00000001;
		int result=a&mask;
		String R=result==1?"奇数":"偶数";
		System.out.println("二进制形式为"+Integer.toBinaryString(a));
		System.out.println("八进制形式为"+Integer.toOctalString(a));
		System.out.println("十六进制形式为"+Integer.toHexString(a));
		System.out.println(mask);
	
	}
}
