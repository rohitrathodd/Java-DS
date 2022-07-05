package sorting;
import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {

		int[] crr= {2,5,4,3,1,0,6,8,7,5};

		System.out.println(Arrays.toString(crr));
		cyclic(crr);
		System.out.println(Arrays.toString(crr));
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

	
}































