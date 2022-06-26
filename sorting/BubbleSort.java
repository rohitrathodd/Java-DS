package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,4,8,7,9};
		bubbleSort(arr);
		bubbleSorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	// function by kunal
	public static void bubbleSort(int[] arr) {
		boolean swapped = false; // incorrect see my code
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			for(int j=1;j<arr.length-1;j++) {
				if(arr[j]<arr[j-1]) {
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	// my function mine 
		public static void bubbleSorting(int[] arr) {
			
			for(int i=0;i<arr.length;i++){
				boolean swapped = false;
				for(int j=1;j<arr.length-i;j++) {


						if(arr[j]<arr[j-1]) {
							int temp = arr[j];
							arr[j]= arr[j-1];
							arr[j-1]=temp;
							swapped=true;
						}
						
					}
				if(!swapped) {
					break;
				}
				
				}
			}
}
