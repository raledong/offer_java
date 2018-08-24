package cn.deerowl.mirror_of_binary_tree_27;

public class Solution {

    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode lft = root.left;
        TreeNode rgt = root.right;
        root.left = rgt;
        root.right = lft;
        Mirror(root.left);
        Mirror(root.right);
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