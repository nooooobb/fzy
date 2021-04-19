import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [3,9,20,15,7]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
@Slf4j
public class 层次遍历 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","2");

        Set<String> strings = map.keySet();
        Set<Map.Entry<String, String>> entries = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            next.getKey();
            next.getValue();
        }
    }

    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }




    public static List<List<Integer>> level22(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root ==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> mid = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                mid.add(node.val);

                if(node.left != null)queue.offer(node.left);
                if(node.right != null)queue.offer(node.right);
            }

            res.add(mid);

        }


        return res;
    }



































}
