package pattern;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("rows:");
		int rows= scan.nextInt();
		
		for(int i=1; i<=rows; i++) {
			
			for (int j=1; j<=rows; j++) {
				if(i+j == rows +1 || i == j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println("");
		}
	}
}

