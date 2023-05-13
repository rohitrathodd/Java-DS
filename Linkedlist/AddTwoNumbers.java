package Linkedlist;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNumbers {

    public static void main(String[] args){

        int num2 = 1999999999;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=l1.val;
        int num2=l2.val;
        int count =1;

        while(l1.next!=null){
            l1=l1.next;
            num1=(l1.val*((int)Math.pow(10,count)))+num1;
            count++;
        }
        count =1;

        while(l2.next!=null){
            l2=l2.next;
            num2=(l2.val*((int)Math.pow(10,count)))+num2;
            count++;
        }

        int num3=num1+num2;
        ListNode l3 = new ListNode();
        ListNode temp = l3;

        while(num3!=0){
            temp.val=num3%10;
            num3=num3/10;
            if(num3!=0){
                temp.next= new ListNode();
            }
            temp = temp.next;

        }
        return l3;

    }
}
