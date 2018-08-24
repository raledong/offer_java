package cn.deerowl.kth_node_in_bst_54;

public class Solution {

    public TreeNode TreeDepth(TreeNode root, int k) {
        if (root == null) return null;
        return TreeDepthCore(root, k);
    }


    public TreeNode TreeDepthCore(TreeNode root, int k) {
        TreeNode target = null;
        if (root.left != null) {
            target = TreeDepthCore(root.left, k);
        }
        if (target == null) {
            if (k==1) {
                target = root;
            }
            k--;
        }
        if (target == null && root.right != null) {
            target = TreeDepthCore(root.right, k);
        }
        return target;
    }


}
