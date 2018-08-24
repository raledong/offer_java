package cn.deerowl.depth_of_binary_tree_55;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(TreeDepth(root.left) , TreeDepth(root.right)) + 1;
    }
}
