package cn.deerowl.print_binary_tree_horizontally_32;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        TreeNode tmp;
        while (!linkedList.isEmpty()) {
            tmp = linkedList.poll();
            result.add(tmp.val);
            if (tmp.left != null){
                linkedList.add(tmp.left);
            }
            if (tmp.right != null) {
                linkedList.add(tmp.right);
            }
        }
         return result;
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