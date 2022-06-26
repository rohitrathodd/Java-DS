package array.arrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class MultiArrayList {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//initialization
		for(int i =0; i<3;i++) {
			list.add(new ArrayList<>());
		} 
		
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3;j++) {
				list.get(i).add(scan.nextInt());
			}
		}
		
		System.out.println(list);
	
	
	
	
	
	}

	
}
