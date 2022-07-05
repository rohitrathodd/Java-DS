package sorting;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {11,53,5,4,8,0,17,9,88,15,20};
		insertion(arr);

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

	public static void NewInsertion(int[] arr){
		for(int i=0;i<arr.length-2;i++){
			for(int j=i+1;j>0 && arr[j]<arr[j-1];j--){
				int temp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;

			}
		}
	}


}
