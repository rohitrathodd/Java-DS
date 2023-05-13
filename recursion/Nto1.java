package recursion;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println(fun(5));
        fun2(5);
    }
    public static int fun(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return fun(n-1);
    }

    public static void fun2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun2(n-1);
    }
}
