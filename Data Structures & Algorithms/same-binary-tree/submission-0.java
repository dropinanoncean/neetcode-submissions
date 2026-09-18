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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pa = new ArrayList();
        List<Integer> qa = new ArrayList();
        traverse(p, pa);
        traverse(q, qa);
        return pa.equals(qa);
    }

    public void traverse(TreeNode n, List<Integer> list){
        if(n != null){
            list.add(n.val);
            traverse(n.left, list);
            traverse(n.right,list);
        } else {
            list.add(null);
        }
    }
}
