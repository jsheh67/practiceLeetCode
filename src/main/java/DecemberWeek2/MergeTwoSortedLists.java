package DecemberWeek2;

import java.util.List;

public class MergeTwoSortedLists {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null){
        return list2;
    }
    if(list2==null){
        return list1;
    }
    ListNode temp;

    if( list1.val<list2.val){
           temp=list1;
            list1=list1.next;
    }else{
            temp=list2;
            list2=list2.next;
        }

    ListNode Head = temp;
    temp=temp.next;




    while(list1!=null||list2!=null){
        if(list1==null){
            temp=list2;
            list2=list2.next;

        }
        else if(list2==null){
            temp = list1;
            list1=list1.next;

        }else if(list1.val<list2.val){
            temp=list1;
            list1=list1.next;

        } else {
            temp=list2;
            list2=list2.next;

        }
        temp = temp.next;



    }
    return Head;
  }

//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode temp;
//        if(list1==null && list2==null){
//            return list1;
//        }
//        if(list1==null){
//            temp=list2;
//            list2=list2.next;
//        }
//        else if(list2==null){
//            temp=list1;
//            list1=list1.next;
//        }else if( list1.val<list2.val){
//            temp=list1;
//            list1=list1.next;
//        }else{
//            temp=list2;
//            list2=list2.next;
//        }
//
//        ListNode head = temp;
//
//        while (list1.next!=null || list2.next!=null){
//            if(list1.val<list2.val){
//                System.out.print(list1.val+"-");
//                temp.next=list1;
//                list1=list1.next;
//            }else{
//                System.out.print(list2.val+"-");
//                temp.next=list2;
//                list2=list2.next;
//            }
//            temp=temp.next;
//        }
//        return head;
//
//    }

    public static void main(String[] args) {
        ListNode lst1=new ListNode(1);
        ListNode lst1a=lst1.next=new ListNode(2);
        ListNode lst1b = lst1a.next=new ListNode(4);

        ListNode lst2=new ListNode(1);
        ListNode lst2a=lst2.next=new ListNode(3);
        ListNode lst2b = lst2a.next=new ListNode(4);

        System.out.println(mergeTwoLists(lst1,lst2));
        ListNode l = mergeTwoLists(lst1,lst2);

        while (l.next!=null){
            System.out.print(l.val+"-");
            l=l.next;
        }



    }

}
