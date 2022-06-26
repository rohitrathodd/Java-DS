package array;
import java.util.Scanner;
public class TwoDarray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr1d=new int[3];
		int[][] arr2d = new int[3][3];
		
		System.out.println("scanning 1d array:");
		
		for(int i =0; i<arr1d.length;i++) {
			arr1d[i]=scan.nextInt();
		}
		
		for(int i =0; i<arr1d.length;i++) {
			System.out.println(arr1d[i]); 
		}
		
		System.out.println("again 1d array scan");
		//enhanced for loop
		for(int a: arr1d) {
			a=scan.nextInt();
		}
		
		for(int a: arr1d) {
			System.out.println(a);
		}
		
		System.out.println("scan 2d array:");
		for(int i=0; i<arr2d.length;i++) {	
			for(int j=0; j<arr2d[i].length;j++) {
				arr2d[i][j]= scan.nextInt();
			}
		}
		
		//printing
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0; j<arr2d[i].length;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("again 2d array");
		
		for(int[] a: arr2d) {
			for(int b : a) {
				b = scan.nextInt();
			}
		}
		
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0; j<arr2d[i].length;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		//enhanced for loop (upper loop)

		for(int[] a: arr2d ) {
			for(int b: a) {
				System.out.println(b);
			}
		}
	}
}
