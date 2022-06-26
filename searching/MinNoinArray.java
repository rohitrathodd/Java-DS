package searching;
import java.util.Scanner;
public class MinNoinArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}

		int minvalue=searchmin(arr);
		System.out.println(minvalue);
		
		scan.close();
	}
	
	public static int searchmin(int[] arr) {
		int rv=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			if(arr[i]<rv) {
				rv=arr[i];
			}
		}
		
		return rv;
		
	}
}
