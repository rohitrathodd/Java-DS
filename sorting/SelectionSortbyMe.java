package sorting;
import java.util.Arrays;

public class SelectionSortbyMe {
	public static void main(String[] args) {
		
		int[] arr= {1,5,8,75,45,62,87,95,14,75};
		
		SelectionSorting(arr);
		selection(arr);
	}
	
	public static int[] MaxNo(int[] arr,int length) {
		int[] max = {arr[0],0};
		for(int i=0;i<length;i++) {
			if(arr[i]>max[0]) {
				max[0]=arr[i];
				max[1]=i;
			}
		}
		return max;
	}
	
	public static void SelectionSorting(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int[] max = MaxNo(arr,arr.length-i);
			arr[max[1]]=arr[arr.length-i-1];
			arr[arr.length-i-1]=max[0];
			
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

	public static void selection (int[] arr) {
		
		
		for ( int j=0;j<arr.length;j++){
			int max = arr[0];
			for( int i =0; i<arr.length - j ;i++) {
				if(max<=arr[i]){
					max = i;
				}
			}
			
			int temp = arr[arr.length - j-1];
			 arr[arr.length - j-1]= arr[max];
			arr[max]=temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
	
}
