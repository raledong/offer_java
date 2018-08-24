package cn.deerowl.path_of_binary_tree_34;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root != null) {
            FindPath(root, target, new ArrayList<Integer>(), result);
        }
        return result;
    }

    public void FindPath(TreeNode root, int target, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> result) {
        if (root.left == null && root.right == null && target==root.val) {
            cur.add(root.val);
            result.add(new ArrayList<>(cur));
            cur.remove(cur.size() - 1);
        } else {
            cur.add(root.val);
            if (root.left != null) {
                FindPath(root.left, target-root.val, cur, result);
            }
            if (root.right != null) {
                FindPath(root.right, target-root.val, cur, result);
            }
            cur.remove(cur.size() - 1);
        }
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}