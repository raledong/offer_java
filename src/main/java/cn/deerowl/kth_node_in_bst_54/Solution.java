package cn.deerowl.kth_node_in_bst_54;

public class Solution {

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) return null;
        this.k = k;
        return TreeDepthCore(pRoot);
    }

    int k;
    public TreeNode TreeDepthCore(TreeNode root) {
        TreeNode target = null;
        if (root.left != null) {
            target = TreeDepthCore(root.left);
        }
        if (target == null) {
            if (k==1) {
                target = root;
            }
            k--;
        }
        if (target == null && root.right != null) {
            target = TreeDepthCore(root.right);
        }
        return target;
    }


}
