package firstPackage;
import java.util.Scanner;
public class Fabonacci {

	public static void main (String[] args)
	{

		int first_fabonacci=0;
		int second_fabonacci=1;
		int next_fabonacci;
		Scanner scanf = new Scanner(System.in);
		System.out.print("give number:");
		int n = scanf.nextInt();
		System.out.println(first_fabonacci+" \n"+ second_fabonacci);
		
		for(int i=3;i<=n;i++)
		{
			next_fabonacci = first_fabonacci+ second_fabonacci;
			System.out.println(next_fabonacci);
			first_fabonacci=second_fabonacci;
			second_fabonacci = next_fabonacci;
		}

		System.out.println();
		System.out.println();
		// by formula
		for(int i=0;i<=n;i++){

			System.out.println((int) ( (Math.pow(((1+Math.sqrt(5))/2),i) - Math.pow(((1-Math.sqrt(5))/2),i))/Math.sqrt(5)) );
		}
   }
	
}
