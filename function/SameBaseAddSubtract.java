package function;
import java.util.Scanner;
public class SameBaseAddSubtract {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give base:");
		int base = scan.nextInt();
		System.out.println("give first num");
		int num1=scan.nextInt();
		
		System.out.println("give second num:");
		int num2= scan.nextInt();
		
		int addition = add(num1,num2,base);
		int sub = subtract(num1,num2,base);
		
		System.out.println("addition is:" + addition);
		System.out.println("subtraction is:"+ sub);
	}
	
	public static int add(int n1,int n2,int b) {
		int rv=0;
		int carry = 0;
		int p=1;
		while(n1>0||n2>0 || carry >0) {
			int d1=n1%10;
			int d2=n2%10;
			n1/=10;
			n2/=10;
			
			int temp = d1 + d2 + carry; 
			rv = rv + (temp % b)*p;
			carry = temp / b;
			p*=10;
			
		}
		
		return rv;
	}
	
	public static int subtract(int n1, int n2, int b) {
		
		int rv=0;
		int borrow = 0;
		int p =1;
		
		while (n1>0) {
			int d1= n1%10 - borrow;
			int d2= n2%10;
			n1 /= 10;
			n2 /= 10;
			
			if(d1<d2) {
				borrow=1;
				d1= b+d1;
				
			}else {
				borrow=0;
			}
			
			int d = d1 - d2;
			rv += d*p;
			p*=10;
			
			
		}
		
		
		return rv;
	}
}
