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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node = new TreeNode();
        for(int i=0;i<preorder.length;i++){
            node = populateTree(preorder[i],node);
        }

        return node.right;
    }

    private TreeNode populateTree(int val,TreeNode node){
        if(node == null){
            node = new TreeNode(val);
            return node;
        }

        if(val < node.val){
            node.left = populateTree(val,node.left);
        }

        if(val > node.val){
            node.right = populateTree(val,node.right);
        }

        return node;
    }
}
