package pattern;
import java.util.Scanner;
public class Pattern6 {
	public static void main( String[] args) {
		
		Scanner scan = new Scanner( System.in);
		System.out.println("give rows:");
		int n = scan.nextInt();
		int st= n/2 +1 ;
		int sp = 1;
		
		for (int i =1; i<=n; i++) {
			
			for(int j=1; j<=st; j++) {
				System.out.print("*");
			}
			
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=st; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
			if(i<=n/2) {
				st--;
				sp+=2;
			} else {
				st++;
				sp-=2;
			}
		}
	}
}
