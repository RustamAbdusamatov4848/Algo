package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    public static void main(String[] args) {

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int sum = 0;
        if(low<=root.val && root.val<=high){
            sum+=root.val;
        }
        if(root.val > low){
            rangeSumBST( root.left,  low, high);
        }
        if(root.val < high){
            rangeSumBST( root.right, low, high);
        }
        return sum;

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root.left);
        inorderTraversal(root.right);
        return list;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }