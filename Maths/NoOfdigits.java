package Maths;
// find the number of digits in base b;

public class NoOfdigits {
    public static void main(String[] args){
        int n=495940;
        int b=10;

        // for any base;
        // log (base b) a = log(base x) a / log (base x) b
        int ans = (int) (Math.log(n)/Math.log(b)) +1;
        System.out.println(ans);

        // for decimal shortcut
        System.out.println((int)(Math.log10(n))+1);
    }
}
