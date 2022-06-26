package array;

import java.util.Arrays;

public class PassingArrayInFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,65,12};
		System.out.println(Arrays.toString(nums));
		System.out.println(Integer.toHexString(System.identityHashCode(nums)));
		change(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] names= {"rohit","rathod","hello"};
		System.out.println(Arrays.toString(names));
		change_String(names);
		System.out.println(Arrays.toString(names));
		
		System.out.println(Arrays.toString(names));
		int i=10;
		System.out.println(i);
		System.out.println(Integer.toHexString(System.identityHashCode(i)));
		change(i);
		System.out.println(i);
	}
	
	static void change(int[] arr) {
		System.out.println(Integer.toHexString(System.identityHashCode(arr)));

		
	}
	static void change(int a) {
		System.out.println(Integer.toHexString(System.identityHashCode(a)));
		a=20;
	}
	
	static void change_String(String[] arr) {
		arr= new String[]{"rohit"};
	}
}
