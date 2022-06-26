package firstPackage;
import java.util.Scanner;

// finding greatest common divisor and lcm between 2 number;
public class GcdLcm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("give First num:");
		int first_num= scan.nextInt();
		
		System.out.println("Give second num:");
		int second_num = scan.nextInt();
		
		int org_first=first_num;
		int org_second=second_num;
		
		
		 
		 
		// code for gcd 
		 
		if(first_num>second_num) {
			int temp;
			temp = second_num;
			second_num = first_num;
			first_num= temp;
	
		}
		
		/*
		 * first method for gcd by me
		for(int div=2; div <= first_num; div++) {
			
			if(first_num == second_num) {
				gcd = first_num;
				break;
			}else if( first_num % div == 0 && second_num % div == 0) {
				gcd = div;
			}
		
		}
		
		System.out.println(gcd);
		
		*/
		
		//second method
		
		int temp;
		while(first_num%second_num!=0) {
			
			temp=first_num%second_num;
			second_num=first_num;
			first_num=temp;
		}
		

		int gcd=first_num;
		System.out.print("gcd is:");
		System.out.println(gcd);
		
		int lcm= (org_first * org_second)/gcd;
		System.out.print("lcm is:");
		System.out.println(lcm);
		
	}
}
