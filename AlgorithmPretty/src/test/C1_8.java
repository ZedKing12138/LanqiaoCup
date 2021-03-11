package test;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM;

public class C1_8 { 
	public static void printArray_2D(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" "+array[i][j]);
				if(j==array[i].length-1) System.out.println(" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 问题：在一个数组中，除了一个数只出现一次外，其他的数都出现了k次，求出这个只出现一次的数
		 */
		
		int[] array= {5,8,5,8,6,6,3};
		System.out.println("只出现了一次的数为："+findNum_Occur1_B(array,2));
		
	}
      /*
		 * 思路1：暴力破解
	     用另一个数组来记录各个数出现的次数，最后遍历该数组找出值为1的位置所对应的数即可
		 */
		//s用两个数组，value用于记录出现了哪几种数值，count用于记录某个数出现的次数（两者一一对应）
	    public static int findKey(int[] array,int key) {
	    	for (int i = 0; i < array.length; i++) {
				if(array[i]==key) {
					return i;
				}
			}
			return -1;
	    	
	    }
		public static int findNum_Occur1_A(int[] array) {
			int length=array.length;
			int valueNum=0;
			int[] value=new int[length];
			int[] count=new int[length];
			for (int i = 0; i < length; i++) {
				value[i]=Integer.MAX_VALUE;
				count[i]=Integer.MAX_VALUE;
			}
			for (int i = 0; i < array.length; i++) {
				if(findKey(value, array[i])==-1) {
					value[valueNum]=array[i];
					count[valueNum]=1;
					valueNum++;
				}else if (findKey(value, array[i])!=-1) {
					count[findKey(value, array[i])]++;
				}
			}
			for (int i = 0; i < count.length; i++) {
				if(count[i]==1) {
					return value[i];
				}
			}
			return Integer.MAX_VALUE;
			
			
		}
		/*
		 * 思路2：利用一个巧妙的性质，k个k进制的数进行不进位加法，最终结果为0（k进制下的0），通过此方式来消除k个重复的数
		 */
		public static int findNum_Occur1_B(int[] array,int k) {
			char[][] kRadixArray=new char[array.length][50];
			for (int i = 0; i < array.length; i++) {
				char[] kRadixNum=Integer.toString(array[i], k).toCharArray();
				int q=0;
				for (int j = kRadixNum.length-1; j >=0; j--) { //s得到的k进制的数倒着存（从左到右依次为低位到高位），方便对齐
					kRadixArray[i][q]=kRadixNum[j];
					q++;
				}
				
			}
			int[] result_in_kRadix=new int[50];
			for (int i = 0; i < 50; i++) {
				int sum=0;
				for (int j = 0; j < array.length; j++) {
					if(kRadixArray[j][i]!='\u0000') {
						sum+=kRadixArray[j][i]+1-'1';
					}
					
				}
				result_in_kRadix[i]=sum%k;
			}
			int result=0;
			for (int i = 0; i < result_in_kRadix.length; i++) {
				result+=Math.pow(k, i)*result_in_kRadix[i];
			}
			return result;
			
		}
}
