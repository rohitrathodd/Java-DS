package function;
import java.util.Scanner;
public class DeciToAnyBase {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("give number in deci:");
		int number = scan.nextInt();
		
		System.out.println("Give base:");
		int base = scan.nextInt();
		
		int conv_num = converter(number,base);
		
		System.out.println(conv_num);
		
	}
	
	public static int converter(int num, int base) {
		int c_num=0,rem;
		int p=1;
		while(num !=0) {
			rem = num % base;
			num = num/base;
			c_num += rem * p;
			p = p* 10;
			
		}
		return c_num;
	}
}
