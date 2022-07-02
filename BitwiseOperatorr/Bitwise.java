package BitwiseOperatorr;

public class Bitwise {

    public static void main(String [] args){
        int[] arr= {1,2,7,2,2,1,1,4,5,4,5,5,4};

        System.out.println(9&1);
        DecimalToBinary(11);
        MagicNumber(4);
    }

    public static void DecimalToBinary(int n){

        int sum=0;
        int count=0;
        while(n>0){
            sum+=(n&1)*(Math.pow(10,count));
            count++;
            n=n>>1;
        }
        System.out.println(sum);

    }


    public static void MagicNumber(int n){
        int sum=0;
        int count=1;

        while(n>0){
            sum+=(n&1)*(Math.pow(5,count));
            count++;
            n=n>>1;
        }

        System.out.println("magic number is:"+ sum);
    }


}
