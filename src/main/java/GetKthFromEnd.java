/**
 *
 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。

 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。

 示例：

 给定一个链表: 1->2->3->4->5, 和 k = 2.

 返回链表 4->5.
 */
public class GetKthFromEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode newList = getKthFromEnd(head,2);
        while(newList != null){
            System.out.println(newList.val);
            newList = newList.next;
        }
    }

    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++)
            former = former.next;
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }



    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode mid = reverseList(head);
        ListNode res = mid;

        for (int i = 0; i < k-1; i++) {
            res = res.next;
        }
        res.next = null;
        return reverseList(mid);
    }

    static ListNode reverseList(ListNode node){
        ListNode res = null;
        ListNode temp ;

        while(node != null){
            temp = node.next;
            node.next = res;
            res = node;
            node = temp;
        }
        return res;
    }











    public void quickSort(int[] n,int low ,int high){
        if(low > high)
            return;

        int i = low;
        int j = high;
        int temp = n[low];

        while(i < j){
            while (n[j] > temp && i < j)
                j--;
            if(i<j){
                n[i] = n[j];
                i++;
            }

            while (n[i] < temp && i<j)
                i++;
            if(i<j){
                n[j] = n[i];
                j--;
            }
        }
        n[i] = temp;
        quickSort(n,low,i-1);
        quickSort(n,i+1,high);
    }
}
