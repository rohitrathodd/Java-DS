package sorting;
import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] arr= {1,3,5,4,8,7,9};
		bubblesort(arr);
		selection(arr);
	}
	
	public static void bubblesort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean swap=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap= true;
				}
			}
			if(!swap) {
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selection(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int min= minnumberindex(arr, i, arr.length);
			int temp= arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static int minnumberindex(int[] arr, int start,int end) {
		int min=start;
		for(int i=start+1;i<end;i++) {
			if(arr[i]<arr[min]) {
				min=i;
			}
		}
		return min;
	}
}
