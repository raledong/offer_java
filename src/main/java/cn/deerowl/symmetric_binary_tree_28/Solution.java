package cn.deerowl.symmetric_binary_tree_28;

public class Solution {

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot==null) return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode lft, TreeNode rgt) {
        if (lft==null) return rgt==null;
        if (rgt==null) return false;
        if (lft.val != rgt.val) return false;
        return isSymmetrical(lft.left, rgt.right) && isSymmetrical(lft.right, rgt.left);
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