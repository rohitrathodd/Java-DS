package firstPackage;

/* hello world
 * 
 * 
 */

import java.util.Scanner;

public class PrimeNumberB2number{
	
	public static void main (String[] a) {
	Scanner scanf = new Scanner(System.in);
	System.out.println("Give low number");
	
	int low_number;
	low_number = scanf.nextInt();
	
	System.out.println("give high number:");
	int High_number= scanf.nextInt();
	
	for(int n=low_number; n<High_number; n++) {
		
		
		int count=0;
		
		for(int div=2; div*div<=n;div++) {
			
			if(n%div ==0) {
				++count;
				break;
			}
		}
		
		if(count==0) {
			System.out.println(n);
		}
	}
	
	}
	

} 