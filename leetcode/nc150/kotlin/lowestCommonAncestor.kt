// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/submissions/
/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    // T: O(logn), S: O(1)
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var cur = root
        while (cur != null) {
            if(cur.`val` > p!!.`val` && cur.`val` > q!!.`val`) cur = cur?.left
            else if(cur.`val` < p!!.`val` && cur.`val` < q!!.`val`) cur = cur?.right
            else break
        }
        return cur
    }
}
