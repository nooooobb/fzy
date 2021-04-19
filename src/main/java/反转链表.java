import java.lang.reflect.Array;
import java.net.Socket;
import java.util.Arrays;
//反转链表
public class 反转链表 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode newList = reverseList3(head);
        while(newList != null){
            System.out.println(newList.val);
            newList = newList.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode t2 = head.next;
        ListNode newList = reverseList(head.next);


        t2.next = head;

        head.next = null;
        return newList;

    }

    public static ListNode reverseList2(ListNode node) {
        ListNode res = null;
        ListNode temp ;
        while (node != null) {
            temp = node.next;
            node.next = res;
            res = node;
            node = temp;
        }
        return res;
    }



    public static ListNode reverseList3(ListNode node){
        ListNode temp ;
        ListNode res = null;
        while ( node != null){
            temp = node.next;
            node.next = res;
            res = node;
            node = temp;
        }

        return res;

    }





























}
