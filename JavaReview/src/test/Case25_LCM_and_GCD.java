package test;

public class Case25_LCM_and_GCD {

public static int[] getLCM_and_GCD(int m,int n) {
int[] result=new int[2]; 
int ini_multi=m*n;
int r;
	while((r=m%n)!=0) {
		m=n;
		n=r;
	
 }
	result[1]=n;
	result[0]=ini_multi/result[1];
	return result;
	
	
}
	public static void main(String[] args) {
		int[] result=new int[2];
		result=getLCM_and_GCD(7, 25);
		System.out.println("最大公因数为："+result[1]+"\n"+"最小公倍数为："+result[0]);
		
		
	}
}
