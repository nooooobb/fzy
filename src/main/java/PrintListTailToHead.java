import java.util.*;


/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class PrintListTailToHead {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
//        System.out.println(Arrays.toString(reversePrint(head)));
        System.out.println(Arrays.toString(reversePrint2(head)));
    }

    public static int[] reversePrint(ListNode head) {

        List<Integer> mid = new ArrayList<>();
        int i = 0;

        while (head != null){
            mid.add(head.val);
            head = head.next;
            i++;
        }
        int[] result = new int[mid.size()];
        for (int j = 0; j < mid.size(); j++) {
            result[j] = mid.get(i-1);
            i--;
        }

        return result;
    }

    //利用栈
    public static int[] reversePrint2(ListNode head) {
        Deque<Integer> mid = new LinkedList<>();
        int i = 0;
        while (head != null){
            mid.push(head.val);
            head = head.next;
            i++;
        }

        int[] result = new int[mid.size()];
        for (int j = 0; j < i; j++) {
            result[j] = mid.pop();
        }
        return result;
    }
}
