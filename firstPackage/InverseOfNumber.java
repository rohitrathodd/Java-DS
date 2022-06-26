package firstPackage;
import java.util.Scanner;
import java.util.*;
public class InverseOfNumber {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		
		//count digits
		int digit=0;
		int temp= number;
		while(temp!=0) {
			temp=temp/10;
			digit++;
		}
		int sum=0;
		for(int i=1; i<=digit;i++) {
			int a;
			
			a=number%10;
			sum = sum+ i* (int) Math.pow(10, a-1);
			number=number/10;
		}
		System.out.println(sum);
	}

	
}
