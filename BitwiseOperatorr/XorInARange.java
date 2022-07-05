package BitwiseOperatorr;

public class XorInARange {
    public static void main(String[] args){
        int a=3;
        int b=9;

        // xor between a and b
        // is equal to xor till 9
        // and xoring it to xor till a-1;

        System.out.println(Xor(a-1)^Xor(b));
    }

    public static int Xor(int x){

        if(x%4==0){
            return x;
        }else if(x%4==1){
            return 1;
        }else if(x%4==2){
            return x+1;
        }else if(x%4==3){
            return 0;
        }

        return -1;
    }
}
