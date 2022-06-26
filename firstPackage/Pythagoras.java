package firstPackage;

import java.util.Scanner;

public class Pythagoras {

	
	public static void main() {
		Scanner scan= new Scanner(System.in);
		System.out.println("first nun");
		int n1= scan.nextInt();
		System.out.println("second num");
		int n2= scan.nextInt();
		System.out.println("third num");
		int n3= scan.nextInt();
		int h,p,b;
		
		
		if(n1>n2 && n1>n3) {
			
			h=n1;
			p=n2;
			b=n3;
		}
		else if(n2>n1 && n2>n3) {
			h=n2;
			p=n1;
			b=n3;
		}
		else {
			h=n3;
			p=n1;
			b=n2;
		}
		
		if((int)Math.pow(h, 2)== (int)Math.pow(p,2)+(int)Math.pow(b,2)) {
			System.out.println("yes this is right angle triangle");
		}
		else {
			System.out.println("this is not right angle triangle");
		}
	}
}
