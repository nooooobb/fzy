import java.util.PriorityQueue;
import java.util.Queue;

public class TopK {
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        System.out.println(findKthLargest(n, 2));
    }

        public static int findKthLargest(int[] nums, int k) {
            Queue<Integer> queue = new PriorityQueue<>();

            for (int v : nums) {
                queue.offer(v);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
            return queue.peek();
        }

}
