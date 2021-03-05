package test;

public class Case24_99multiplyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 基本思路：双重for循环，外层控制第几行（条件：i从1到9）
		 * 内层控制第几列（条件：j从1到i）
		 */
		for (int i = 1; i <=9; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.printf("%d×%d=%d  ",j,i,j*i);
				if(j==i) System.out.printf("\n");
				
			}
		}
	}

}
