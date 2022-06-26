package firstPackage;
import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int div=2; div*div<=number; div++) {
			
			while(number%div==0) {
				number=number/div;
				System.out.println(div);
			}
			
			
		}
		if(number!=1) {
			System.out.println(number);
		}
			
			

	}
}
