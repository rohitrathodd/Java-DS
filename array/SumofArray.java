package array;
import java.util.Scanner;
public class SumofArray {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give first array total number:");
		int n1 = scan.nextInt();
		int [] arr1= new int [n1];
		
		System.out.println("now give arr1 elements:");
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Give first array total number:");
		int n2 = scan.nextInt();
		int [] arr2= new int [n2];
		
		System.out.println("now give arr1 elements:");
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=scan.nextInt();
		}
		
		
	}
}
