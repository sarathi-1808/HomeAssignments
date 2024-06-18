package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int a = 1; 
	    int b = 1;
	    int c = a+b;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i <= num; i++) {
			c = a + b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}
		

	}

}
