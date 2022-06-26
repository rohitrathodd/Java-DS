package pattern;
import java.util.Scanner;
public class Pattern7 {

	public static void main( String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("total rows:");
		int rows= scan.nextInt();
		
		int space= 0;
		
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			System.out.println("");
			space++;
		}
	}
}
