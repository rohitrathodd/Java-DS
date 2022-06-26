package firstPackage;
import java.util.Scanner;
public class RotateAnumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a number");
		int number= scan.nextInt();
		System.out.println("Give rotation");
		int rotation= scan.nextInt();
		
		//counting digits in a number
		int digit=0;
		int temp=number;
		while(temp!=0) {
			temp=temp/10;
			digit++;
		}//end of counting digits
		
		
		//rotating the number
		int n;
		int rotated_num=number;
		if(rotation<0) {
		   rotation= digit - (-rotation);
		}
		while(rotation!=0) {
			n= rotated_num%10;
			rotated_num= rotated_num/10;
			rotated_num= rotated_num+ (n*((int)Math.pow(10, digit-1)));
			
			rotation--;
			
		}
		

		//printing rotated number
		System.out.println(rotated_num);
	}
}
