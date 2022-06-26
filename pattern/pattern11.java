package pattern;

public class pattern11 {
    public static void main(String[] args){
        int n =4;

        for(int row =0;row<2*n;row++){
            int up,down,left,right;
            for(int col=0;col<2*n;col++){
                up=row;
                left=col;
                down=2*n-row;
                right=2*n-col;
                System.out.print(min(left,right,up,down)+" ");
            }
            System.out.println();
        }
    }

    public static int min(int a,int b,int c, int d){
        int min =d;
        if(a<=b&&a<=c&&a<=d){
            return a;
        }else if(b<=c&&b<=a&&b<=d){
            return b;
        }else if(c<=b&&c<=a&&c<=d){
            return c;
        }
        return d;
    }
}
