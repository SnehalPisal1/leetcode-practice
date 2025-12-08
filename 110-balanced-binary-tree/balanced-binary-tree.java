/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {

        // heigth left - rigth > 1 -  not balnaced 
        // root null -> balanced 

        if(root == null)
        return true;

        int leftH =  calHeight(root.left);
        int rightH =  calHeight(root.right);

        if(Math.abs(leftH - rightH) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int calHeight(TreeNode root){
        if(root == null){
            return 0;
        } 

        return 1 + Math.max(calHeight(root.right), calHeight(root.left));
    } 
}