package sorting;

import java.util.Arrays;

public class NewBubble {
	public static void main(String[] args) {
		
//		int[] arr = {2,34,554,22,45,21,66,222,67,32};
//		
////		BubbleSort(arr);
//		insertion(arr);
		int[] crr= {2,5,4,3,1,0,6,8,7,5};
//		insertion(crr);
////		BubbleSort(crr);
////		bubblesortnew(crr);
////		System.out.println(Arrays.toString(crr));
		insertionnew(crr);
		System.out.println(Arrays.toString(crr));
	}
	
	public static void bubble(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void BubbleSort(int[] arr) {
		boolean swapped = false;
		for(int i=0;i<arr.length;i++) {
			swapped = false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
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
	
	public static void insertion(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0 && arr[j]<arr[j-1];j--) {
				
				int temp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void cyclic(int[] arr) {

		
		int i=0;
		while(i<arr.length) {
			int correct = arr[i];
			if(correct < arr.length && arr[i]!=arr[correct]) {
				int temp = arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}else {
				i++;
			}
		}
		i=0;
		while(i<arr.length) {
			
			if(arr[i]!=i) {
				System.out.println(i);
				break;
			}
			else {
				i++;
				if(i==arr.length) {
					System.out.println(i);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionnew(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j>0 && j<arr.length;j-- ) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	public static void bubblesortnew(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean swap=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
			
		}
	}
	
	


public static void bubble1(int arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		
		
	}
	
	
	}
	
}































