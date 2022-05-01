// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    // T: O(logn), S: O(1)
    fun findMin(nums: IntArray): Int {
        var l = 0
        var r = nums.size-1
        var m = 0
        var n = nums[0]
        
        while (l <= r) {
            m = (l+r)/2
            // L
            if (nums[l] <= nums[m]) {
                if (n > nums[l]) n = nums[l]
                l = m+1
            // R
            } else {
                if (n > nums[m]) n = nums[m]
                r = m-1
            }
        }
        return n
    }
}

// 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 10
// 9, 10, 1, 2, 10
// 9, 10
