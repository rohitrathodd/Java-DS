package searching;
import java.util.Scanner;
public class InfinityLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,40,50,60};
		int search =scan.nextInt();
	    System.out.println(findStartandEnd(arr, search));	
	}
	
	public static int findStartandEnd(int[] arr,int target) {
		int start=0;
		int end=1;
		
		while(target >arr[end])
		{
			int previousStart=start;
			start=end+1;
			end= end + ((end-previousStart)+1)*2;
		}
		
		return BinarySearch(arr,target,start,end); 
	
	}
	
	
	public static int BinarySearch(int[] arr,int target,int start,int end) {
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return -1;
		
	}
}
