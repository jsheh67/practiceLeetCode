package DecWeek1;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode result = head;
        ListNode temp = result.next;

        List<ListNode> odds = new ArrayList<>();
        List<ListNode> evens = new ArrayList<>();

        int index=0;
        while(temp!=null){
            index++;
            if(index%2==0){
                odds.add(temp);
            }else{
                evens.add(temp);
            }
            temp=temp.next;
        }

        temp=result;

        //odds.add(head);
        for(ListNode l: odds){
            temp.next=l;
            temp=temp.next;
        }
        for(ListNode l:evens){
            temp.next=l;
            temp=temp.next;
        }
        temp.next=null;


        return result;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next=second;
        ListNode third = new ListNode(3);
        second.next=third;
        ListNode forth = new ListNode(4);
        third.next=forth;
        ListNode fifth = new ListNode(5);
        forth.next=fifth;

        System.out.println(oddEvenList(head));





    }
}
