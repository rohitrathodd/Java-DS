// 34 leetcode

package searching.BinarySearch;
import java.util.Arrays;

public class FirstAndLastIndex {

        public static void main(String[] args){
            int[] arr={1,2,3,4,4,4,4,5,7,8,9};
            int target=4;
            System.out.println(Arrays.toString(searchRange(arr,target)));
        }


        public static int[] searchRange(int[] nums, int target) {

            int start=0;
            int end = nums.length-1;
            int [] arr= {-1,-1};

            while(start<=end){

                int mid = start + (end - start)/2;

                if(nums[mid]==target){


                    arr[0]=mid;

                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }else {
                    end=mid-1;
                }

            }
            start=0; end=nums.length-1;
            while(start<=end){

                int mid = start + (end - start)/2;

                if(nums[mid]==target){


                    arr[1]=mid;

                    start=mid+1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }else {
                    end=mid-1;
                }

            }



            return arr;

        }

}
