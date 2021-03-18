package test;

import java.util.Arrays;

public class MergeSort {
	
	/*
	 * 	本文件主要研究归并排序
	 */
	
	public static void merge(int[] array,int begin,int mid,int end) {
		//s先申请个辅助空间来存放归并后的数组
		int[] temp=new int[end-begin+1];
		int left=begin;//左指针用来指向左方数组的当前需要参与比较的数
		int right=mid+1;
		for (int i = 0; i < temp.length; i++) {
			if(array[left]<=array[right]) {
				temp[i]=array[left];
				left++;
				if(left>mid) {//s若左方数组已经全部放入了temp，则可以将右方数组剩余的元素直接复制到temp
					i++;
					System.arraycopy(array, right, temp, i, end-right+1);
					break;
				}
			}else if (array[left]>array[right]) {
				temp[i]=array[right];
				right++;
				if(right>end) {//s右方数组已经全部放入了temp，则可以将左方数组剩余的元素直接复制到temp
					i++;
					System.arraycopy(array, left, temp, i, mid-left+1);
					break;
				}
			}
		}
		//s归并成功，将temp复制回到array的begin~end区间
		System.arraycopy(temp, 0, array, begin, end-begin+1);
		
	}
	
	public static void mergeSort(int[] array,int begin,int end) {
		if(begin>=end) {//s若数组分到很小，则直接返回
			return;
		}
		int mid=(begin+end)/2;
		mergeSort(array, begin, mid);
		mergeSort(array, mid+1, end);
		merge(array, begin, mid, end);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {7,6,5,4,3,2,1,0};
		mergeSort(array, 0, 7);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
