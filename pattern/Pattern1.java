package pattern;
import java.util.Scanner;
public class Pattern1 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give number of rows:");
		
		int rows= scan.nextInt();
		
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=i; j++)
				System.out.print("*\t");
			
			System.out.println("");
		}
	}
}
