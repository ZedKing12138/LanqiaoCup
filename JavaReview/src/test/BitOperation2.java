package test;

public class BitOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*   A^B^B=A
				A=A^B
				B=A^B
			    A=A^B
			    */
	 int a=135;
	 int b=148;
	 a=a^b;
	 b=a^b;
	 a=a^b;
	 System.out.println("a: "+a+" b: "+b);
	}

}
