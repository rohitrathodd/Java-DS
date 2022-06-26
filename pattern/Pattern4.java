package pattern;
import java.util.Scanner;
public class Pattern4 {
	 public static void main( String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("rows number:");
		 int rows= scan.nextInt();
		 
		 int space=0;
		 int star=rows;

		 
		 for(int i=1; i<=rows; i++) {
			 
			 for(int j= 1; j<=space; j++) {
				 System.out.print("\t");
			 }
			 
			 for(int j=1; j<=star; j++) {
				 System.out.print("*\t");
			 }
			 
			 System.out.println("");
			 space++;
			 star--;
		 }
	 }
}
