package BitwiseOperatorr;
// find the ith bit in the given number;

public class FindtheithBit {
    public static void main(String[] args){
            int n=11;
            int i=2;

            System.out.println(n&(1<<i));
    }
}
