package DecWeek1;
//1669
public class MergeInBetweenLinkedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int i=0;
        ListNode backStart = null;
        while(temp.next!=null){
            if(i==b){
                backStart=temp;
            }
            i++;
            temp = temp.next;
        }

        ListNode temp2 = list1;
        ListNode list2Temp = list2;

        int j=0;
        while (temp2.next!=null){
            if(j==a){
                temp2.next=list2Temp;
            }

            j++;
            temp2 = temp2.next;
        }
        return list1;

    }


}
