package recursion;

public class FabonacciFormula {
    public static void main(String[] args){
        int n=11;
        for(int i=0;i<n;i++){
            System.out.println(fabonacciFormula(i));
        }

    }
    public static int fabonacciFormula(int n){

        return (int)(( Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n) )/ Math.sqrt(5));
    }

}
