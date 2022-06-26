package function;
import java.util.Scanner;
public class AnyBaseToAnyBase {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Write base1:");
		int base1= scan.nextInt();
		System.out.println("Give number of base1:");
		int num= scan.nextInt();
		
		System.out.println("give base2:");
		int base2= scan.nextInt();
		
		if(base1==10) {
			num=convertBase(num,base2);
		}
		else {
			num=convertToDeci(num,base1);
			num=convertBase(num,base2);
		
		}
		System.out.println(num);
		
		
			
	}
	
	public static int convertToDeci (int num,int base) {
		
		int Decinum=0;
		int count=0;
		int d=0;
		while(num>0) {
			d = num % 10;
			num = num/10;
			
			for(int i = count; i>0; i--){
				d = d* base;
			}
			count++;
			Decinum= Decinum+d;
				
		}		
		return Decinum;
		
	}
	
	public static int convertBase(int num,int base) {
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


