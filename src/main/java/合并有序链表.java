import java.util.Arrays;

public class 合并有序链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);



    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode result = l3;

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        while (l1 != null && l2 != null){

            if(l1.val <= l2.val){
                result.next = l1;
                l1 = l1.next;
            }else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        result.next = l1 == null ? l2 : l1;
        return l3.next;
    }
}
