package Maths;

public class IsPrimeNumber {
    public static void main(String[] args){
        int n=47;
        System.out.println(isprime(n));
    }
    public void bark(){
        System.out.println("barking");
    }
    public static boolean isprime(int num){

        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
