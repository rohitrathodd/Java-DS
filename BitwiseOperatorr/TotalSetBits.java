package BitwiseOperatorr;

public class TotalSetBits {
    public static void main(String[] args){

        int n=(1<<31)-1;
        int count =0;
        System.out.println(Integer.toBinaryString(n));

        // code by me
        while(n>0){
            int rightBit=0;
            rightBit=n&(-n);
            // my code is not good cause if it is enter in loop means it has atleast one 1s.

            if(rightBit!=0){
                count++;
                n=n-rightBit;
            }else break;
        }
        System.out.println(count);
        n=(1<<31)-1;
        count=0;
        // code by kunal
        while(n>0){
            count++;
            n-=(n&(-n));
        }
        System.out.println(count);

        // code by kunal again
        n=(1<<31)-1;
        count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        System.out.println(count);
    }
}
