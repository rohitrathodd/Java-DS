package firstPackage;
import java.util.Scanner;
public class Fabonacci {

	public static void main (String[] args)
	{

		int first_fabonacci=0;
		int second_fabonacci=1;
		int next_fabonacci;
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		System.out.println(first_fabonacci+" \n"+ second_fabonacci);
		
		for(int i=3;i<=n;i++)
		{
			next_fabonacci = first_fabonacci+ second_fabonacci;
			System.out.println(next_fabonacci);
			first_fabonacci=second_fabonacci;
			second_fabonacci = next_fabonacci;
		}
   }
	
}
