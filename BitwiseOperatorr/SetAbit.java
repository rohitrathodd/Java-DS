package BitwiseOperatorr;
// set a bit at perticular position like nth bit from right

public class SetAbit {
    public static void main(String [] args){

        int n=9;
        System.out.println(Integer.toBinaryString(n));
        int bit =3;
        int ans =n|(1<<(bit-1));
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));
    }
}
