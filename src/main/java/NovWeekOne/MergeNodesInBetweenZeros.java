package NovWeekOne;

import java.util.ArrayList;
import java.util.List;

public class MergeNodesInBetweenZeros {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }

//    public static ListNode mergeNodes(ListNode head) {
//       //// List<Integer> asList = new ArrayList<>();
//
//        ListNode temp = head;
//        ListNode total = new ListNode(0);
//        while(temp!=null){
//            temp=temp.next;
//            total.val+=temp.val;
//        }
//        return total;
//
//    }

    public ListNode mergeNodes(ListNode head) {
        ListNode newList = head;
        ListNode curr_head = head.next;
        int sum = 0;
        while(curr_head != null)
        {
            sum = 0;
            while(curr_head.val != 0)
            {
                sum = sum + curr_head.val;
                curr_head = curr_head.next;
            }
            newList.next = curr_head;
            curr_head.val = sum;
            newList = newList.next;
            curr_head = curr_head.next;
        }

        return head.next;
    }







}
