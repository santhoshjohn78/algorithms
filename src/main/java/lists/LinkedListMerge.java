package lists;


import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class LinkedListMerge {
    public static void printList(ListNode listNode){
        do{
            System.out.print("->");
            System.out.print(listNode.val);
            listNode = listNode.next;
        }while(listNode !=null);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr;
        ListNode head;
        if (list1.val<list2.val){
            head = new ListNode(list1.val);
            list1 = list1.next;
            curr = head;
        }else if (list1.val>list2.val){
            head = new ListNode(list2.val);
            list2 =  list2.next;
            curr = head;
        }else{
            head = new ListNode(list1.val);
            head.next = new ListNode(list2.val);
            list1 = list1.next;
            list2 = list2.next;
            curr = head.next;
        }

        while(list1!=null && list2!=null){
            if (list1.val<list2.val){
                curr.next = new ListNode(list1.val);
                curr = curr.next;
                list1 = list1.next;
            }else if (list1.val>list2.val){
                curr.next = new ListNode(list2.val);
                curr = curr.next;
                list2 = list2.next;
            }else {
                curr.next = new ListNode(list1.val);
                curr = curr.next;
                curr.next = new ListNode(list2.val);
                curr = curr.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        if (list1!=null){
            curr.next = list1;
        }
        if (list2!=null){
            curr.next = list2;
        }
        return head;

    }

    public static void main(String args[]){
        ListNode lll1 = new ListNode(4);
        ListNode ll1 = new ListNode(2,lll1);
        ListNode l1 = new ListNode(1,ll1);

        ListNode lll2 = new ListNode(4);
        ListNode ll2 = new ListNode(3,lll2);
        ListNode l2 = new ListNode(1,ll2);

        System.out.print("List1=");
        printList(l1);
        System.out.println("");
        System.out.print("List2=");
        printList(l2);
        System.out.println("");
        ListNode merged = mergeTwoLists(l1,l2);
        System.out.print("Merged=");
        printList(merged);
    }

}
