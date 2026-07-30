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
    public int maxDepth(TreeNode root) {

        ArrayList<List<Integer>> ans=new ArrayList<>();
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int size=q.size();

            ArrayList<Integer> levels=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                levels.add(curr.val);

                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            ans.add(levels);

        }
        return ans.size();
        
    }
}
