package test;

import com.sun.javafx.image.IntPixelAccessor;

public class AboutRecursion {

	/*
	 * 说明：本文件主要讨论递归
	 */
	/*
	 * 练习1：利用递归实现阶乘
	 */
	public static long factorial(int maxNum) {
		if(maxNum==0) return 1;
		else {
			return maxNum*factorial(maxNum-1);
		}
		
	}
	/*
	 *练习2：顺序打印从i到j的数 
	 */
	public static void print_i_to_j(int i,int j) {
		if(i==j) {
			System.out.println(i);
			return;
		}else if(i<j){
			System.out.println(i);
			print_i_to_j(i+1, j);
		}
	}
	/*
	 * 练习3：求数组的和	
	 */
	public static int getArraySum(int[] array,int cursor) {
		if(cursor<array.length) {
			return array[cursor]+getArraySum(array, cursor+1);
		}
		return 0;
		
		
	}
	/*
	 * 练习4：字符串翻转
	 */
	public static String reverseString(String src,int cursor) {
		if(cursor==src.length()) {
			return "";
		}
		return reverseString(src, cursor+1)+src.charAt(cursor);
	}
	/*
	 * 练习5：斐波拉契数列递归求法
	 */
	public static int fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	/*
	 * 练习6：以递归的形式实现插入排序
	 * 思路：要将n个数排好序，只需要先将前n-1个数排序，再将第n个数插入即可
	 */
	public static void insertSort_in_recursion(int[] array,int n) {
		if(n==1) {
			return;
			}
		insertSort_in_recursion(array, n-1);
		for (int i = n-1; i >=1; i--) {
			if(array[i]<array[i-1]) {
				int temp=array[i];
				array[i]=array[i-1];
				array[i-1]=temp;
			}else {
				break;
			}
		}
	}
	/*
	 * 练习7：递归实现汉诺塔
	 */
	public static char getComplementaryChar(char x,char y) {
		if(x=='A'&&y=='B') {
			return 'C';
		}else if (x=='B'&&y=='A') {
			return 'C';
		}else if (x=='A'&&y=='C') {
			return 'B';
		}else if (x=='C'&&y=='A') {
			return 'B';
		}else if (x=='B'&&y=='C') {
			return 'A';
		}else if(x=='C'&&y=='B'){
			return 'A';
		}
		
		return '\u0000';
		
		
	}
	public static void hanoiTower(int n,char start,char end) {
		if(n==1) {
			System.out.println(n+"号盘从"+start+"到"+end);
			return;
		}
		hanoiTower(n-1, start, getComplementaryChar(start, end));
		System.out.println(n+"号盘从"+start+"到"+end);
		hanoiTower(n-1, getComplementaryChar(start, end), end);
		
	}
	/*
	 * 练习8：二分查找的递归写法
	 */
	public static int binarySearch_in_recursion(int[] array,int start,int end,int key) {
		if(start<=end) {
			int mid=(start+end)/2;
		if(key==array[mid]) {
			return mid;
		}
		else if (key>array[mid]) {
			return binarySearch_in_recursion(array, mid+1, end, key);
		}else if(key<array[mid]) {
			return binarySearch_in_recursion(array, start, mid-1, key);
		}
		 }
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("阶乘结果为："+factorial(5));
		
		//print_i_to_j(1, 100);
		
		//int[] array= {132,46,7987,6454,146,165};
		//System.out.println("求得的数组和为："+getArraySum(array, 0));
		
		//String src="我是芜湖大司马";
		//System.out.println("翻转后的字符串为："+reverseString(src, 0));
		
		/*for (int i = 1; i < 101; i++) {
			System.out.print(fibonacci(i)+"  ");
		}*/
		
		
		int[] array= {1,5,4,3,46,21,9,10,18};
		insertSort_in_recursion(array, 9);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		//hanoiTower(4, 'A', 'B');
	
		//int[] array= {1,5,6,9,15,58,69,100};
		//System.out.println("二分查找得到的位置索引是："+binarySearch_in_recursion(array, 0, array.length-1, 100));
	
	}

}
