// https://leetcode.com/problems/invert-binary-tree/submissions/
class Solution {
    // Time: O(n) where n = # nodes, Space O(h) where h = height of tree
    public TreeNode invertTree2(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
    
     public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
        }
        return root;
    }
}
