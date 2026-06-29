// Last updated: 6/29/2026, 5:42:40 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>>ans = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if(root == null)return ans;
21        q.offer(root);
22        while(!q.isEmpty()){
23            int size = q.size();
24            ArrayList<Integer> row = new ArrayList<>();
25            for(int i = 0 ; i < size ; i++){
26                TreeNode curr = q.poll();
27                row.add(curr.val);
28                if(curr.left != null)q.offer(curr.left);
29                if(curr.right != null)q.offer(curr.right);
30            }
31            ans.add(row);
32        }
33        return ans;
34    }
35}