package Maths;

import static java.lang.System.in;

public class SqrtOfNumber {
    public static void main(String[] args){
        int n = 42;
        int p=4;
        System.out.println(sqrt(n,p));

    }

    public static float sqrt(int n,int p) {

        int start = 0;
        int end = n;
        float root = 0.0f;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mid * mid) == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        root = end;
        float incr=0.1f;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                    root+=incr;

            }

            root-=incr;
            incr/=10;

        }

        return root;
    }
}
