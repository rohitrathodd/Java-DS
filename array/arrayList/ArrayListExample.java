package array.arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(2);
		list.add(45);
		list.add(78);
		list.add(56);
		list.add(89);
		list.add(657);
		System.out.println(list);
		
		list.set(0,56); //change item at index 0
		System.out.println(list);
		System.out.println(list.contains(67));
		list.remove(3);//remove index number 3;
		
		for(int i=0;i<5;i++) { //adding 5 more items after previous
			// 5 items
			list.add(scan.nextInt());
		}
		
		// get item at any index
		for(int i=0;i<9;i++) {
			System.out.println(list.get(i)); //pass index here
		}
		
		
	}
}
