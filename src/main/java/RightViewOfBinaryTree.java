import java.util.*;

/**
 * https://www.interviewbit.com/problems/right-view-of-binary-tree/
 * O(n) time | O(n) space where n is the number of nodes in the tree
 */
public class RightViewOfBinaryTree {
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
                if (i == 0)
                    result.add(node.val);

                if (node.right != null)
                    queue.offer(node.right);

                if (node.left != null)
                    queue.offer(node.left);
            }
        }
        return result;
    }
}
