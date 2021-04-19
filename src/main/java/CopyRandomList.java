import java.util.HashMap;
import java.util.List;

public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if(head == null)return null;
        Node res = null;
//        while(head != null){
//            res.val = head.val;
//            res.random = head.random;
//            res.next = head.next;
//            head = head.next;
//        }
        res = head;

        return res;
    }

    //实现链表的深拷贝
    public ListNode copyList(ListNode head){
        
        ListNode curr = head;
        ListNode dum = new ListNode(0);
        ListNode pre = dum;
        while(curr != null){
            ListNode node = new ListNode(curr.val);
            pre.next = node;

            curr = curr.next;
            pre = node;
        }

        return dum.next;

    }
}
