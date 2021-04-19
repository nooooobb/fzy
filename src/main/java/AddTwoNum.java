import org.junit.Test;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */


public class AddTwoNum {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Ali ali = new Ali();
//        ali.getClass().getClassLoader().loadClass("");
        Class<?> aClass = Class.forName("Ali");
        System.out.println(aClass.newInstance().getClass());
//        Map<Character,Integer> map = new HashMap<>();
//        System.out.println(map.put('c', 1));
//        System.out.println(map.put('b',2));
//        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Character, Integer> next = iterator.next();
//
//            System.out.println(next+"------"+map.get(next));
//        }
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        ListNode listNode = addTwoNumbers(l1, l2);
//        while (listNode != null){
//            System.out.print(listNode.val);
//            listNode = listNode.next;
//            if (listNode != null){
//                System.out.print(" -> ");
//            }
//        }
//        addTwoNumbers(l1,l2);
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null,tail = null;

        int carry = 0;
        while (l1 != null || l2 != null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            if(head == null) {
                head = new ListNode((n1 + n2 + carry) % 10);
                tail = head;
            }else {
                tail.next = new ListNode((n1 + n2 + carry) % 10);
                tail = tail.next;
            }

            carry = (n1+n2+carry)/10;
//            tail = tail.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        if(carry > 0){
            tail.next = new ListNode(carry);
        }

        System.out.println("FING");

        return head;
    }
}
