package searching;

import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int[] arr = {1,2,3,4,5,6,7};
//		int search = scan.nextInt();
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]==search) {
//				System.out.print("found at "+i+" index");
//				return ;
//			}
//				
//		}	
//		System.out.println("not found");

		String[] name = {"rohit","rathod"};
		char search = 'a';
		char[] chararr = name.toString().toCharArray();
		char[] chararr2 = {'a','b','c'};
		int[] intarr = {12,25,65,24,56};
		String[] name2 = name;
		
		System.out.println(chararr[1]);
		System.out.println(chararr);
		System.out.println(name);
		
//		System.out.println("int arr ");
//		System.out.println(intarr.getClass()+"@"+Integer.toHexString(System.identityHashCode(intarr)));
//		System.out.println(intarr);
//		System.out.println(Arrays.toString(intarr));
//		System.out.println(Arrays.toString(intarr).getClass()+" @"+Integer.toHexString(System.identityHashCode(Arrays.toString(intarr))));
//		
//		System.out.println();
//		System.out.println("char arr2 ");
//		System.out.println(chararr2);
//		System.out.println(chararr2.getClass()+"@ "+Integer.toHexString(System.identityHashCode(chararr2)));
//		System.out.println(Arrays.toString(chararr2));
//		
//		System.out.println();
//		System.out.println("name");
//		System.out.println(name);
//		System.out.println(name.getClass());
//		System.out.println(Integer.toHexString(System.identityHashCode(name)));
//		
//		System.out.println();
//		System.out.println("name2");
//		System.out.println(name2);
//		System.out.println(name2.getClass());
//		System.out.println(Integer.toHexString(System.identityHashCode(name2)));
//		
//		
//		System.out.println(chararr);
//		System.out.println(name.toCharArray().getClass()+"@ "+Integer.toHexString(System.identityHashCode(chararr)));
//		System.out.println(name.toCharArray().getClass()+"@ "+Integer.toHexString(System.identityHashCode(name.toCharArray())));
//		
//		
//		System.out.println(LinearSearchMethod(name,search));
//		System.out.println(LinearSearch2(name,search));


	}
	
	
	static boolean LinearSearchMethod(String name,char search) {
		
		if(name.length()==0) {
			return false;
		}
		// here is length is method string
		// name.length()
		for(int i=0;  i< name.length();i++) {
			
			if(name.charAt(i)== search ) {
				return true;
			}
		}
		
		return false;
	}

	static boolean LinearSearch2(String name, char search) {
			// here we converted string into char array
		// thats why we use .length attribute
		
			for(int i=0; i<name.toCharArray().length;i++) {
				if(name.charAt(i)==search) {
					return true;
				}
			}
			return false;
		}
}

