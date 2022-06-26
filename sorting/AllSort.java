package sorting;

import java.util.Arrays;

public class AllSort {
	public static void main (String[] args) {
		
		int[] arr = { 1,52,52,59,7,48,25,64,12,4,3,8,0};
		
//		bubble(arr);
		insertion(arr);
	}
	
	public static void bubble(int[] arr) {
		boolean swap;
		for(int i=0;i<arr.length;i++) {
			swap =false;
			for(int j=1; j<arr.length-i;j++) {

				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap = true;
				}
			}
			
			if(!swap) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	// insertion sort by me 
	
	public static void insertion (int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {

			for(int j=i+1;j>0 && arr[j]<arr[j-1];j--) {
				
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
					
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	//insetion by kunal
	
	public static void insertsort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else {
					break;
				}
			}
		}
	}

	public static void cyclicsort(int[] arr){

		int i=0;
		while(i<arr.length){
			int correct= arr[i]-1;
			if(arr[i]!=arr[correct]){
				int temp = arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;

			}
			i++;
		}
	}
	
}
