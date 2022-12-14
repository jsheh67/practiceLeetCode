package DecemberWeek2;

public class RemoveDuplicateSortedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode newHead = temp;

        while (temp.next!=null){
            if(temp.val==temp.next.val){
                if(temp.next.next==null){
                    temp.next=null;
                }else {
                    temp.next = temp.next.next;
                }
            }
            temp=temp.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next= new ListNode(1).next=new ListNode(2)
                .next=new ListNode(3).next=new ListNode(3);

        ListNode newHead = deleteDuplicates(head);

        while (newHead.next!=null){
            System.out.print(newHead.val+"-");
            newHead=newHead.next;
        }

    }


}
