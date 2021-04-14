package test;

import java.util.Arrays;

public class Exercise3 {

	/*
	 * 本文件主要做一些练习题
	 */
	
	
	/*
	 * 练习1:给定一个数组，现要求将其中所有的奇数放在前面，而偶数放在后面
	 * 思路：借鉴快排中的partion思想，用两个指针从前后两端往中间扫描，遇到奇数或偶数就停下来，然后交换即可。
	 */
	
	
	public static void oddEvenPartition(int[] array) {
		int begin=0;
		int end=array.length-1;
		while(true) {
			while(array[begin]%2==1) {
				begin++;
				if(begin==array.length) {
					break;
				}
			}
			while(array[end]%2==0) {
				end--;
				if(end==-1) {
					break;
				}
			}
			
			if(begin<=end) {
				int temp=array[begin];
				array[begin]=array[end];
				array[end]=temp;
			}else {
				break;
			}
			
		}
		
	}
	
	/*
	 * 练习2:数组中有一个数字出现的次数超过了数组总长度的一半，现在请找出该数字
	 */
	/*
	 * 思路1：直接将整个数组排序，然后返回中间索引指向的数即可
	 */
	public static int findNumOccur_overHalf1(int[] array) {
		Arrays.sort(array);	
		return array[array.length/2];
		
	}
	/*
	 * 思路2：直接用已经实现的找到第k小数的函数，将k置为数组长度的一半即可
	 */
	public static int findNumOccur_overHalf2(int[] array) {
	return	find_K_small_Num(array, array.length/2+1, 0, array.length-1);
	}
	
	/*
	 * 练习3：给定一个无序的数组，找出其第k小的数
	 * 思路1：模仿快排中划分的思想，每次划分完毕后都要将pivot的最终下标和k进行比较，若相等，则直接返回，
	 * 若比k大，则在左边子数组中继续划分；若比k小，则在右边子数组中继续划分
	 */
	
	public static int partition(int[] array,int begin,int end) {
		if(begin>=end) {//s若没法再进行划分
			return -1;
		}
		
		int pivot=array[begin];
		int left=begin+1;
		int right=end;
		while(true) {
			while(array[left]<=pivot) {
				left++;
				if(left>end) {
					break;
				}
			}
			while(array[right]>pivot) {
				right--;
			}
			if(left>right) {
				break;
			}
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			
		}
		int temp=array[begin];
		array[begin]=array[right];
		array[right]=temp;
		return right;
		
		
	}
	
	public static int find_K_small_Num(int[] array,int k,int begin,int end) {
		if(begin==end) {
			return array[begin];
		}
		int pivotIndex=partition(array, begin, end);
		if(k==pivotIndex+1) {
			return array[pivotIndex];
		}else if (k<pivotIndex+1) {
			return find_K_small_Num(array, k, begin, pivotIndex-1);
		}
			return find_K_small_Num(array, k, pivotIndex+1, end);
	}
	
	/*
	 * 思路2：用一个辅助数组模拟最大堆的形式，该数组大小为k，数组最后一个元素为堆中的最大元素，先用原数组的前k个元素去初始化一个堆
	 * 然后从第k+1个数开始，和堆顶的元素进行比较，若该数小于等于堆顶元素，则用该数取代堆顶数，并进行一次堆的维护；若该数大于堆顶元素，则不进行处理。
	 */
	public static int[] makeHeap(int[] array,int begin,int end) {
		int[] heap=Arrays.copyOfRange(array, begin, end+1);
		//s对刚创建的堆进行维护
		for (int i = 1; i < heap.length; i++) {
			for (int j = i; j>0&&heap[j]<heap[j-1]; j--) {
				int temp=heap[j];
				heap[j]=heap[j-1];
				heap[j-1]=temp;
			}
		}
		return heap;
		
		
	}
	
	public static void mainTainHeap(int[] heap) {
		for (int i = 1; i < heap.length; i++) {
			for (int j = i; j>0&&heap[j]<heap[j-1]; j--) {
				int temp=heap[j];
				heap[j]=heap[j-1];
				heap[j-1]=temp;
			}
		}
	}
	
	public static int find_K_small_Num1(int[] array,int k) {
		int[] heap=makeHeap(array, 0, k-1);
		int heapTop=heap.length-1;
		for (int i = k; i < array.length; i++) {
			if(array[i]<=heap[heapTop]) {
				heap[heapTop]=array[i];
				mainTainHeap(heap);
			}
		}
		return heap[heapTop];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] array= {2,4,6,8,10};
		oddEvenPartition(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}*/
		
		//int[] array= {6,4,5,6,6,6,2,6};
		//System.out.println("出现次数超过一半长度的数为："+findNumOccur_overHalf2(array));
		
		int[] array= {3,1,4,8,2,6,5,7};
		int k=3;
		System.out.println("此数组第"+k+"小的数为: "+find_K_small_Num1(array, k));
		
		
	}

}
