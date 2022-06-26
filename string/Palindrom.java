package string;
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
		 String name="rohit" ;
		 String name2= new String("rohit");
		 System.out.println(name==name2);
		 System.out.println(name.equals(name2));
	}
	
	
	public static void ispalindrom1() {
		  
		  String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length(); 

	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      
	      
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");
	}
	
	
	
	
}
