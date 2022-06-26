package function;
import java.util.Scanner;
public class function_permutation {
	
	public static int fact(int x){
		int nfact=1;
		
		for(int i=1; i<=x; i++) {
			nfact= nfact*i;
		}
		return nfact;		
	}
	
	public static void main( String args[]) {
		Scanner scan = new Scanner (System.in);
		int n , r;

		System.out.println("give n :");
		n = scan.nextInt();
		System.out.println("give r : ");
		r = scan.nextInt();
		
		int nfact = fact(n);
		int n_rfact= fact(n-r);
		
		int npr = nfact/n_rfact;
		
		System.out.println(npr);
		
		
	}
}
