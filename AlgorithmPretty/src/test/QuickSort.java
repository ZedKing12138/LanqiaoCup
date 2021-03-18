package test;



/*
 * 本文件主要研究快速排序
 */
public class QuickSort {
	
	/*
	 * 思路1：单向分区扫描法，两个指针，一个smaller，一个bigger。smaller指针左边的数都小于等于pivot（这里为方便起见我们取首元素作为pivot）
	 * bigger指针右边的数都大于pivot
	 */
	
	public static void quickSort1(int[] array,int begin,int end) {
		if(begin>=end) {//s若划分的子数组是在太小，甚至发生错位情况，直接返回，不用再排序
			return;
		}
		int smalller=begin+1;
		int bigger=end;
		int pivot=array[begin];
		while(smalller<=bigger) {
			if(array[smalller]<=pivot) {//s若扫到的数小于等于pivot，smaller左方得到扩充，右移一次。
				smalller++;
			}else if (array[smalller]>pivot) {//s若扫到的数大于pivot，则将当前数与bigger指向的数交换，bigger右方得到扩充，左移一次
				int temp=array[smalller];
				array[smalller]=array[bigger];
				array[bigger]=temp;
				bigger--;
			}
		}
		//s循环结束，smaller指针和bigger指针发生错位,我们将pivot放到最终该放到的位置（bigger处）
		int temp=array[bigger];
		array[bigger]=array[begin];
		array[begin]=temp;
		quickSort1(array, begin, bigger-1);
		quickSort1(array, bigger+1, end);
	}
	
	/*
	 * 思路2：双向分区扫描法：利用两个指针left和right，left从左往右扫描，直到遇到一个比pivot大的数，right从右往左扫描，直到遇到一个小于等于pivot的数
	 * 然后将两者交换，后继续向中间扫描，直至left和right发生错位（left>right）,最后的pivot会停在right指向的位置
	 */
	
	public static void quickSort2(int[] array,int begin,int end) {
		if(begin>=end) {//s若子数组的规模太小以致于发生错位，则无需再排，直接返回即可
			return;
		}
		int left=begin+1;
		int right=end;
		int pivot=array[begin];
		while(true){
			while(array[left]<=pivot) {
				left++;
				if(left>end) {//s若left一直向右移而越界，需要及时停下来 
					break;
				}
			}
			while(array[right]>pivot) {
				right--;
			}
			if(left>right) {//s发生错位，及时地退出循环
				break;
			}
			//s找到相应的位置后，交换left和right指向的数
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
		}
		//s最终的right就是pivot应该放置的位置
		int temp=array[begin];
		array[begin]=array[right];
		array[right]=temp;
		quickSort2(array, begin, right-1);
		quickSort2(array, right+1, end);
		
	}
	
	
	/*
	 * 练习：找到一个数组的中值（这里不严格区分奇偶）
	 */
	
	public static int getMidIndex(int[] array,int begin,int end) {
		
		
		
		
		
		
		return end;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {6,6,5,4,3,2,1};
		quickSort1(array, 0, 6);
		//quickSort2(array, 0, 5);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
