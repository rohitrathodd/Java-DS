package searching.BinarySearch;
import java.util.Scanner;
public class BinerySearch {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int[] arr= {2,3,4,5,6,7,8,9,10,50,56,58,98};
		 
		 System.out.print("give number to find: ");
		 int target = scan.nextInt();
		 
		 System.out.println("given number is at index "+ BinarySearch(arr,target));
		 
		 System.out.println("given number is at index "+ MyBinarySearch(arr, target));
	
		 System.out.println("given number is at index "+ newBinary(arr, target));
		 
		 scan.close();
	}
	
	public static int BinarySearch(int[] arr, int target) {
		int start=0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid= start + (end-start)/2;
			
			if(target<arr[mid]) {
				end = mid -1;
			}else if(target>arr[mid]) {
				start = mid + 1;
			}else if(target==arr[mid]) {
				return mid;
			}
		}
		
		return -1;
		
		
	}

	public static int MyBinarySearch(int[] arr, int target) {
		
		int start =0;
		int end = arr.length -1;
		
		while(start<=end) {
			int mid= start + (end-start)/2;
			
			if(target<arr[mid]) {
				end = mid-1;
			}else if(target>arr[mid]) {
				start = mid +1;
			}else if(target == arr[mid]) {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static int newBinary(int[] arr, int target) {
		
		int start=0;
		int end= arr.length-1;
		
		while(start<end) {
			int mid = start + ( end - start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return -1;
	}



}