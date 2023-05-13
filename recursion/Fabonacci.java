package recursion;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give number to find its fabonnacci number:");
        int n = scan.nextInt();
        System.out.printf("%d",fabonacci(n));
    }
    public static int fabonacci(int n){
        if(n<2){
            return n;
        }
        return fabonacci(n-1)+fabonacci(n-2);
    }


}
