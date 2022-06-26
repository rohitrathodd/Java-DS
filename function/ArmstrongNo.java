package function;
import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(IsArmstrong(num));
		
	}
	
	static boolean IsArmstrong(int num) {
		int original = num;
		int sum = 0;
		
		while(num>0) {
			int temp;
			temp = num %10;
			num/=10;
			
			sum += temp*temp*temp;
		}
		return sum == original;
		
	}
}
