package array;
import java.util.Scanner;
import java.util.Arrays;
public class ReturnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr= {
				{1,2,3},
				{5,8,9,45},
				{12,54,6,89,45}
		};
		
		System.out.println("give search number:");
		int search = scan.nextInt();
		System.out.println(Arrays.toString(search(arr,search)));
		
		scan.close();
	}
	
	public static int[] search(int[][] arr, int search) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]==search) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {-1,-1};
	}
}
