package array;
import java.util.Scanner;
public class BarChart {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give total column:");
		int column = scan.nextInt();
		
		int [] arr = new int[column];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("column " + i+": ");
			arr[i]=scan.nextInt();
		}
		
		int max=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=max;i>0; i--) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[j]>=i) {
					System.out.print("* \t");
				}else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
}
