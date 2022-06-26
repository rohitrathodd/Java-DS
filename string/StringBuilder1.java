package string;
import java.util.Arrays;
public class StringBuilder1 {
    public static void main(String[] args){
        StringBuilder name = new StringBuilder();
        name.append("Rohit Rathod");
        System.out.println(name);
        name.append(5);
        System.out.println(Arrays.toString(name.toString().toCharArray()));
        System.out.println(name.toString());


        //reverse it will reverse the actual string;
        System.out.println(name.reverse());

        //delete
        name.delete(0,1);
        System.out.println(name);
    }
}
