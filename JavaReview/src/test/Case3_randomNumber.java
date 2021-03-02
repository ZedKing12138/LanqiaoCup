package test;

public class Case3_randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  a+(int)(b-a+1)*random()        [a,b] int型
		 *  a+(b-a+1)*random()    [a,b+1) double型
		 */
	int a=1;
	int b=3;
	for (int i = 0; i < 100; i++) {
	int r1=a+(int)((b-a+1)*Math.random());
	double r2=a+(b-a+1)*Math.random();
	System.out.println(r1+"   "+r2);	
	}
	
	}

}
