package firstPackage;
import java.util.Arrays;
import java.util.Scanner;
public class Datatypes {

	public static void main (String [] args){
		
//		Scanner scn = new Scanner(System.in);
//		char a = scn.next().trim().charAt(0);

		fun(12,2,5,23,56,5,6,6);
		
	}
	
	public static void fun(int ...a) {
		System.out.println(Arrays.toString(a));
	}
}
