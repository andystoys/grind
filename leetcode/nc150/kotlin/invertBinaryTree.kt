/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

/*
 * Perfect(?)/full binary?
 * Swap L <-> R
 *   - Even swap nulls?

    root
    /  \
   L    R
  / \  / \
 L   R    R
 
 // TD, BU
 */
class Solution {
    // TD, T: O(n), S: O(h)
    fun invertTree3(root: TreeNode?): TreeNode? {
        if (root != null) {
            val tmp = root.left
            root.left = root.right
            root.right = tmp
            
            invertTree(root.left)
            invertTree(root.right)
        }
        return root
    }
    
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root != null) {
            // Can't do this because you lose the value...gets overwritten
            // root.left  = invertTree(root.right)
            // root.right = invertTree(root.left)
            val r = invertTree(root.right)
            val l = invertTree(root.left)
            root.left  = r
            root.right = l
        }
        return root
    }
}
