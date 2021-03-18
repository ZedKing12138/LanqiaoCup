package test;

import java.util.Arrays;

import javax.swing.plaf.FontUIResource;

public class Exercise1 {
	public static int count=0;
	/*
	 * 本文件主要做一些编程练习
	 */
	
	/*
	 * 练习1：小白上楼梯，楼梯共有n阶，每次可以选择上1/2/3阶，问一共有多少种走法？
	 * 思路：经典递归，类似汉诺塔
	 */
	public static int upStairs1(int destinatonStep) {
		if(destinatonStep==0) {
			count++;
			System.out.println("开始走楼梯！");
			return count;
		}
		if(destinatonStep<0) {
			return -1;
		}
		
			
		if(upStairs1(destinatonStep-3)!=-1) {
				System.out.println("从"+(destinatonStep-3)+"走到"+destinatonStep);
			}
		
		
		if(upStairs1(destinatonStep-2)!=-1) {
				System.out.println("从"+(destinatonStep-2)+"走到"+destinatonStep);
			}
		
		
		if(upStairs1(destinatonStep-1)!=-1) {
				System.out.println("从"+(destinatonStep-1)+"走到"+destinatonStep);
			}
		
		
		return count;
		
	}
	
	public static int upStairs2(int n) {
		if(n==1) {
			return 1;
		}else if(n==2) {
			return 2;
		}else if(n==3) {
			return 4;
		}
		return upStairs2(n-1)+upStairs2(n-2)+upStairs2(n-3);
			
	}
	
	/*
	 * 练习2:找到旋转数组中的最小数。（eg：[1,2,3,4,5 ]------>[3,4,5,1,2]）
	 思路：类似二分法的思想，每次从中间分开，必有一组有序另外一组无序，且无序的组里面一定会包含最小值，
	 我们不同的二分并选择无序的组即可把最终的范围缩小到两个，返回最右边的那个数即可
	 */
	
	public static int getMin_In_rotatedArray(int[] array) {
		int begin=0;
		int end=array.length-1;
		int mid=(begin+end)/2;
		//s首先排除0旋转的情况
		if(array[begin]<array[end]) {
			return array[0];
		}
		while(begin+1<end) {
			if(array[begin]>array[mid]) {
				end=mid;
			}else if (array[mid]>array[end]) {
				begin=mid;
			}
			mid=(begin+end)/2;
		}	
		return array[end];	
	}
	
	/*
	 * 练习3：最长连续递增子序列
	 * 思路1：递归的思路，先判断整个数组是否满足连续递增，若满足则返回起始和终止下标，若不满足则将长度缩小1，分别求两端的子数组的最长连续递增子序列。
	 */
	public static int[] longestContinueIncrease_Subseq(int[] array,int begin,int end) {
		//s检查当前的数组是否满足连续递增
		boolean flag=true;
		for (int i = begin; i < end; i++) {
			if(array[i]>array[i+1]) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			int[] result=Arrays.copyOfRange(array, begin, end+1);
			return result;
		}
		int[] resultleft=longestContinueIncrease_Subseq(array, begin, end-1);
		int[] resultRight=longestContinueIncrease_Subseq(array, begin+1, end);
		return resultleft.length > resultRight.length ? resultleft : resultRight;
	}
	/*
	 * 思路2：双重for循环，外层确定子序列的起点，内层确定子序列的终点，每次找到一个连续递增的子序列都要记录它的长度，若大于当前最长，则更新开始和终止的下标
	 */
	public static int[] longestContinueIncrease_Subseq1(int[] array) {
		int beginIndex=0;
		int endIndex=0;
		int length=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length-1; j++) {
				if(array[j]>array[j+1]) {
					if((j-i+1)>length) {
						length=j-i+1;
						beginIndex=i;
						endIndex=j;
			     }
					break;
				}
			}
			
		}
		return Arrays.copyOfRange(array, beginIndex, endIndex+1);
		
	}
	
	/*
	 * 练习4：如何快速去求得x的n次幂
	 * 思路：将次数n进行二进制的分解，然后把x，x2，x4，x8.....s的值分别储存在一个数组中
	 * 从数组的最低位开始填充，每次填充时都优先考虑利用前一位的平方来得到。
	 */
	public static int power(int x, int n) {
		//s首先将n转换成二进制
		char[] binary_n=new StringBuilder(Integer.toString(n, 2)).reverse().toString().toCharArray();
		int[]  info=new int[binary_n.length];
		info[0]=x;
		for (int i = 1; i < binary_n.length; i++) {
			info[i]=info[i-1]*info[i-1];
		}
		int result=1;
		for (int i = 0; i < binary_n.length; i++) {
			if(binary_n[i]=='1') {
				result=result*info[i];
			}
		}
		return result;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("总的走法有: "+upStairs2(1)+"种！");
		
		//int[] array= {5,6,3,4};
		//System.out.println("旋转数组中最小的数为："+getMin_In_rotatedArray(array));
		
		/*int[] array= {4,3,2,3,5};
		int[] result=longestContinueIncrease_Subseq(array, 0, array.length-1);
		int[] result1=longestContinueIncrease_Subseq1(array);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"  ");
		}*/
		
		System.out.println("幂值的计算结果为："+power(2, 5));
	}

}
