package Maths;

public class PrimeFrom0toN {
    public static void main(String[] args){
        int n=40;
        boolean[] notPrime= new boolean[n+1];
        System.out.println(1);
        primeNo(n,notPrime);

    }

    public static void primeNo(int n, boolean[] notPrime){
        for(int i=2;i*i<=n;i++){

            if(!notPrime[i]){
                for(int j=i*2;j<=n;j+=i){
                    notPrime[j]=true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(!notPrime[i]){
                System.out.println(i);
            }
        }
    }
}
