package searching;

import java.util.Arrays;

public class StringAndCharArray {

	public static void main(String[] args) {
		
//	    stringCharArray();
//		stringArrayChar2dArray();
//		integerRefrences();
		stringAndArray();
	}
	
	
	public static void stringCharArray() {

		String stringName = "rohit";
		char[] charArray = {'r','a','h','u','l'};
		
		System.out.println(stringName); //print from refrence
		System.out.println(charArray); // also can print from refrence
		System.out.println(stringName.toString());
		System.out.println(charArray.toString());
		
		charArray = stringName.toCharArray(); // assigning string into char array after converting into charArray
		System.out.println(charArray);   // printing charArray
		System.out.println(stringName); 
	

		char[] charArray2 = charArray; // assigning string into char array
		System.out.println((charArray==stringName.toCharArray())); // compare both char array and string 
		System.out.println((charArray==charArray2));
		System.out.println(stringName.toCharArray()==stringName.toCharArray()); 
		System.out.println();
		
	}
	
	public static void integerRefrences() {
		int i =10;
		int j= 10;
		int k = 11;
		System.out.println("i @ "+Integer.toHexString(System.identityHashCode(i)));
		System.out.println("j @ "+Integer.toHexString(System.identityHashCode(j)));
		System.out.println("k @ "+Integer.toHexString(System.identityHashCode(k)));

		i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println("i @ "+Integer.toHexString(System.identityHashCode(i)));
		System.out.println("j @ "+Integer.toHexString(System.identityHashCode(j)));
		System.out.println("k @ "+Integer.toHexString(System.identityHashCode(k)));
	}
	
	public static void stringArrayChar2dArray() {
		
		String[] stringArray = { "ramesh","dinesh","Mohit"}; // string array
		String string;
		char[] charArray;
		char[][] charArray2d;
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[0].charAt(0));
		System.out.println();
		
		System.out.println(stringArray);
		System.out.println(stringArray[0].toString());
		string = stringArray.toString();
		
		charArray = stringArray.toString().toCharArray(); 
		System.out.println(charArray[0]);
		System.out.println(stringArray[1].toCharArray()[1]);
		
	}
	
	public static void stringAndArray() {
		
		String name = "rohit";
		String[] namearr = {"rahul","dinesh"};
		
		char c = 'a';
		char[] characters= {'a','c','d'};
		
		int[] arr= {12,13,45,56};
		int[][] arr2 = {
						{12,25},
						{45,54}
						};
		
		System.out.println(name);
		System.out.println(name.toString());
		
		System.out.println(name.getClass().getName());
		
		System.out.println(namearr);
		System.out.println(namearr.toString());
		System.out.println("*********");
		System.out.println(namearr[0].charAt(1));
		System.out.println(namearr[0].toCharArray());
		
		System.out.println(Arrays.toString(namearr.toString().toCharArray()));
		System.out.println();
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	
		}
}

