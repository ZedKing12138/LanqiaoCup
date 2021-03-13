package test;

public class ShellSort {

	/*
	 * 本文件用于实现希尔排序
	 * 介绍：希尔排序本质是插入排序的一种变体，又称为“缩小增量排序”
	 * 每一趟选取一个增量gap，通过增量来实现分组，然后在每组内部实现插入排序（消除一些逆序）
	 * 一趟一趟的减小增量（最终减小到1），完成希尔排序
	 */
	public static void ShellSort(int[] array) {
		int gap=array.length/2;
		while(gap>=1) {
			for (int i = 0; i < gap; i++) {//s找到每一组的起始位置
				for (int j = i+gap; j < array.length; j=j+gap) {//s找到每次新插入的数的位置
					for (int k = j; k-gap>=0; k=k-gap) {
						if(array[k]<array[k-gap]) {
							int temp=array[k];
							array[k]=array[k-gap];
							array[k-gap]=temp;
						}else {
							break;
						}
					}
				}
			}
			
			gap=gap/2;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,5,4,2,46,23,78,27,12,101};
		ShellSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
