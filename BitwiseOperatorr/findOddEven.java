package BitwiseOperatorr;

public class findOddEven {
    public static void main(String[] args){
        int a=78;
        System.out.println(isodd(a));
    }

    public static boolean isodd(int a) {
        return (a & 1) ==1;
    }
}
