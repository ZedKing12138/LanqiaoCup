package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import javafx.scene.chart.AreaChart;



public class C1_2 {
    
    public static void printArray(int[] array) {
    	for(int e:array) {
    		System.out.println(e);
    	}
    }
 
    public static int randomNum(int min,int max) {
    	return (int)(Math.random()*(max-min+1)+min);
    	
    }
    public static void shuffleArray(int[] array) {
    	for (int i = 0; i < array.length; i++) {
			int random=randomNum(0, array.length-1);
			int temp=array[i];
			array[i]=array[random];
			array[random]=temp;
		}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 问题：给定1-1000的数字，和一个长度为1001的数组，其中只有一个数字发生了重复，要求找出重复的数字。且每个数组 元素只能访问一次，不能有额外
		 * 的储存空间。
		 * 思路：利用异或的性质来去重复。
		 */
		int[] array=new int[1001];
		for (int i = 0; i < array.length-1; i++) {
			array[i]=i+1;
		}
		array[1000]=randomNum(1, 1000);
		System.out.println("本次的重复数字为："+array[1000]);
		shuffleArray(array);
		//开始
		int r=0;
		for (int i = 0; i < array.length; i++) {
			r=r^array[i]^(i+1);
		}
		r=r^1001;
		System.out.println("最终的找到的重复数字为："+r);
		
		
		
		
	}

}
