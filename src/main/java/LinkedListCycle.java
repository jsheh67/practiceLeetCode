public class LinkedListCycle {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        if(head==null){return false;}
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && slow!=null){


            if(fast.next==null || slow.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }

}
