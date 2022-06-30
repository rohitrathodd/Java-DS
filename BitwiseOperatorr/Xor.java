package BitwiseOperatorr;

// in array all elements are twice except one find that one.

public class Xor {
    public static void main(String[] args){

        int [] arr={2,5,4,2,8,5,4,6,8};

        System.out.println(findno(arr));
    }

    public static int findno(int[] arr) {
        int value=0;
        for(int i=0;i<arr.length;i++){
            value=value ^arr[i];
        }
        return value;
    }
}
