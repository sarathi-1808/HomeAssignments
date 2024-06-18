package week1.day2;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 193;
		boolean prime = false;
		for (int i = 2; i <=num/2; i++) {
			
			if(num %i==0) {
				prime = true;
				break;
			}
			
		}
		
         if (!prime)
        	 System.out.println(num + " is a prime number");
         else
        	 System.out.println(num + " is an even number");
         }

}
