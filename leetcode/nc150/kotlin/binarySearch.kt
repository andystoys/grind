class Solution {
    // Recursive
    fun search(nums: IntArray, target: Int): Int {
        return searchHelper(0, nums.size-1, 0, nums, target)
    }
    
    // T: O(logn), S: O(logn)
    fun searchHelper(l: Int, r: Int, m: Int, nums: IntArray, target: Int): Int {
        return when {
            l > r -> return -1
            nums[m] > target -> searchHelper(l, m-1, (l+m-1)/2, nums, target)
            nums[m] < target -> searchHelper(m+1, r, (m+1+r)/2, nums, target)
            else -> return m
        }
    }
    
    // Iterative, T: O(logn), S: O(1)
    fun search1(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size-1
        var m = 0

        while (l <= r) {
            m = (r + l) / 2
            when {
                nums[m] > target -> r = m-1 
                nums[m] < target -> l = m+1
                else -> return m
            }
        }
        return -1
    }
}
