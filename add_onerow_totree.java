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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q=new LinkedList<>();
        int level=1;
        if(depth==1) {
             TreeNode num=new TreeNode(val);
             num.left=root;
            return num;
        } 
        q.add(root);
        while(!q.isEmpty()) {
            int size=q.size();
            for(int i=0;i<size;i++) {
            TreeNode n=q.poll();
            if(level==depth-1) {
             TreeNode n1=new TreeNode(val);
             TreeNode n2=new TreeNode(val);
              n1.left=n.left;
              n2.right=n.right;
              n.left=n1;
              n.right=n2;
            }
             if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            level++;
        }
        return root;
    }
}
