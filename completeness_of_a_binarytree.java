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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        boolean is=true;
        q.add(root);
        while(!q.isEmpty()) {
            int size=q.size();
            for(int i=0;i<size;i++) {
             TreeNode t=q.poll();
             if(t==null) { 
                is=false;
             } else { 
            if(is==false) return false;
                q.add(t.left);
                q.add(t.right);
             }
            }
        }
      
        return true;
    }
}
