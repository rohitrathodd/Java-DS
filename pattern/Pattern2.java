package pattern;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("number of rows:");
		int rows = scan.nextInt();
		
		for(int i= rows; i>0; i-- ) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
