package function;
import java.util.Arrays;

//function overloading
// it is take place at compile time 
// means compiler find that oh it is taking interger
// parameter so it should run this fun()
public class function_overloading {

	public static void main (String [] args) {
		int[] arr;
		arr = new int[2];
		System.out.println(arr);
		fun(67);
 		String [] names= new String[3];
		names[0] = "rohit";
		names[1] = "rahtod";
		names[2]= "hello";
		System.out.println();
		fun(names);
	}
	
	public static void fun(int a) {
		System.out.println(a);
	}
	
	public static void fun(String[] name) {
		System.out.println(Arrays.toString(name));
		
	}
}
