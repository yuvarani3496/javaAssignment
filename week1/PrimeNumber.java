package week1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		 
		int n= 45;
		int n1 = 0;
		
		for (int i = 1; i <=n; i++) {
			
			if (n%1 ==0) {
				
				n1++;				
			}
			
		}
		if (n1==2) {
			System.out.println("IS prime number :" + (n) );
			
		}
		else {
			System.out.println(" Is not prime number : "+ (n));
		}
			
		
		
	}
	

}
