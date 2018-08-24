package cn.deerowl.is_balanced_tree_55_2;

public class Solution {

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }





        return true;

    }

    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        return (left>right)?(left+1):(right+1);
    }
}
