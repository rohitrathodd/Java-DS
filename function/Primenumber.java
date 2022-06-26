package function;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(isPrime(n));
	}
	
	static boolean isPrime(int n) {
		
		for(int i =2; i*i<=n ; i++) {
			
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
