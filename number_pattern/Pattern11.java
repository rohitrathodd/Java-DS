package number_pattern;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give rows");
		int rows = scan.nextInt();

		int value=1;
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(value + "\t");
				value++;
			}
			System.out.println("");
		}
	}
}
