package _general;
import java.util.Scanner;

public class ParseInt {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = Integer.parseInt(scan.nextLine()) ;
		System.out.println(i);
		
		String s = scan.nextLine();
		System.out.println(s);
		
		scan.close();

	}
}
