package array;
import java.util.Scanner;
public class Array {

	public static void main (String [] args) {
		
		int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(arr,13));
	}
	
	    public static boolean searchMatrix(int[][] matrix, int target) {
	       
	        int[] start={0,0};
	        int[] end= {matrix.length-1,matrix[0].length-1};
	        
	        while((start[0]<=end[0] && start[1]<=end[1]) && start[1] < matrix[0].length && end[1] < matrix[0].length
					&& start[0] < matrix.length && end[0] < matrix.length){
	          
	            int[] mid= new int[2];
	            mid[0]=start[0] + (end[0] - start[0])/2;
	            mid[1]=start[1] + (end[1] - start[1])/2;
	          
	            if(target== matrix[mid[0]][mid[1]]){
	                return true;
	            }else if(target < matrix[mid[0]][mid[1]]){
	                 
	                if(mid[1]==0){
	                    end[0]=mid[0]-1;
	                    end[1]=matrix.length-1;
	                }else{
	                    end[0]=mid[0];
	                    end[1]=mid[1]-1;
	                }
	                
	            }else{
	                if(mid[1]==matrix.length-1){
	                    start[0]=mid[0]+1;
	                    start[1]=0;
	                }else{
	                     start[0]=mid[0];
	                    start[1]=mid[1]+1;
	                }
	               
	            }
	            
	        }
	        
	        return false;
	        
	    }
	}
	

