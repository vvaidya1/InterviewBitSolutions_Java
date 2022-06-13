import java.util.*;

/**
 * https://www.interviewbit.com/problems/reverse-level-order/
 * O(n) time | O(n) space - where n is number of nodes in the binary tree
 */
public class ReverseLevelOrder {
    public ArrayList<Integer> solve(TreeNode A) {
        if (A == null)
            return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(A);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                result.add(node.val);

                if (node.right != null)
                    queue.offer(node.right);

                if (node.left != null)
                    queue.offer(node.left);
            }
        }
        Collections.reverse(result);
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}
