package NovWeekOne;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class BinaryLinkedListToInt {


  public int getDecimalValue(ListNode head) {
    StringBuilder b = new StringBuilder();
    ListNode temp = head;
    while (temp != null) {
      b.append(temp.val);
      temp = temp.next;
    }

    return Integer.parseInt(b.toString(), 2);
  }
}
