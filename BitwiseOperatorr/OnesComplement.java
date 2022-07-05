package BitwiseOperatorr;

public class OnesComplement {
    public static void main(String[] args){
        int a=9;
        System.out.println(Integer.toBinaryString(a));


        System.out.println("2's complement "+Integer.toBinaryString(-a));
        System.out.println(-a-1);
        System.out.println("ones complement "+ Integer.toBinaryString(( -a-1)));
    }
}
