package searching;
import java.util.Scanner;

//smallest number in an array greater than or == to target;


public class Ceiling {
	
	public static void main (String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 int[] arr= {2,3,4,5,6,7,8,9,10,50,56,58,98};
		 
		 System.out.print("give number to find: ");
		 int target = scan.nextInt();
		 
		 System.out.println("Ceiling of "+target+" is "+ ceiling(arr, target)); 
		
	}
	
	public static int ceiling(int[] arr, int target) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			
			int mid=start+ (end-start)/2;
			
			if(arr[mid]==target) {
				return arr[mid];
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid;
			}
		}
		
		return arr[start];
	}
}
