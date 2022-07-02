package firstPackage;

import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int number= scan.nextInt();

		System.out.println((int)(Math.log10(number))+1); // shortcut

		int digits=0;
		while(number!=0) {
			number=number/10;
			digits++;
		}
		
		System.out.println(digits);

	}
}
