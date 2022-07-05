package BitwiseOperatorr;

import java.util.Arrays;

class FlipImage {
    public static void main(String[] args){
        int[][] arr= {{1,1,0},{1,0,0},{0,0,1}};
        flipAndInvertImage(arr);
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for(int[] row:image){
            // reversing the array

            /*
                my code for reversing
                all good but not cool
                  for(int j=0;j<(row.length-1)/2;j++){
                        int length=row.length-1;
                        int temp=row[j];
                        row[j]=row[length];
                        row[length]=temp;
                        length--;
                    }

             */

            for(int j=0;j<row.length-1;j++){
                int temp = row[j];
                row[j]=row[row.length-j-1];
                row[row.length-j-1]=temp;

            }

        }



        return image;
    }
}