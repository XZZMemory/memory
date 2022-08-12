package algorithm.socialrecruitment.year2022;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/7/28
 */
public class 二叉树层次遍历 {
    public class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;
    }

    public List<Integer> level(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        // 遍历元素
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                while (!queue.isEmpty()) {
                    TreeNode curNode = queue.poll();
                    res.add(curNode.val);
                    if (curNode.left != null) {
                        queue.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        queue.add(curNode.right);
                    }
                }
            }

        }

        return res;
    }
}
