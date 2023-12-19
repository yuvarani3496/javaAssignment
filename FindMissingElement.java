package week1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int n[] = {1,4,3,2,8,6,7};
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
		
			if ( i+1 != n [i] ) {
				
				System.out.println("The missing element is:" +(i+1) );
				
				break;
				
			}
			
			
		}	
		
		
	}
	

}
