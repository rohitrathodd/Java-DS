package array.arrayList;
import java.util.Scanner;
public class ArrayForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]= scan.nextInt();
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
