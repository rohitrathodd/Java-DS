package sorting;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {11,53,5,4,8,0,17,9,88,15,20};
//		insertion(arr);
//		bubble(arr);
		bubblesortbyme(arr);
	}
	
	public static void insertion(int[] arr) {
		int j=1;
		for(int i=0;i<arr.length-2;i++) {
			j=i+1;
			while(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					j--;
					if(j==0) {
						break;
					}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble (int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			boolean swap = false;
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap = true;
					
				}
				if(!swap) {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubblesortbyme(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]= temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
