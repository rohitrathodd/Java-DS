package number_pattern;
import java.util.Scanner;

public class Pattern12{
	
	public static void main( String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("give total rows:");
		int rows= scan.nextInt();
		int n1 = 0, n2=1;
		int temp;
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(n1 + "\t");
				temp=n1;
				n1=n2;
				n2=n1+temp;
				
			}
			
			System.out.println("");
		}
		
	}
}