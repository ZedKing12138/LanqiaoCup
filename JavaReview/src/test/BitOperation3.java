package test;

public class BitOperation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  * 思考一下关于补码的知识：
  * 如何由负数的补码得出其绝对值？
  * 以4位二进制补码为例：
  * 1011=1010=1101=-5
  * 0100+1=0101
  * 1111=1110=1001=-1
   1000=0111=0000=0100=1011
   对于正数而言，其补码本身就是绝对值
   对于负数而言，将补码所有位取反然后加上1即可
  *  */
		int number=1313132;
	 int abs=number>=0?number:(~(number))+1;
	System.out.println("the absValue of "+number+" Is : "+Integer.toUnsignedString(abs));
	}

}
