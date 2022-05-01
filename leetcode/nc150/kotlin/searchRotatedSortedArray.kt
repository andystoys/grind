// https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size-1
        var m = 0
        
        while(l <= r) {
            m = (l+r)/2
            when {
                nums[m] == target -> return m
                nums[l] <= nums[m] -> {
                    // Left side
                    // normal case // Need to go right, all values < nums[m] on right will be < nums[m] 
                    if (target > nums[m] || target < nums[l]) l = m+1
                    else r = m-1
                }
                else -> {
                    // Right side
                    // Need to go left, all values > m > target so need to go left // normal case
                    if (target < nums[m] || target > nums[r]) r = m-1
                    else l = m+1
                }
            }
        }
        return -1
    }
}

// 4,5,6,7,8,9,0,1,2 target = 9
// 9,0,1,2
// 9

// 4,5,6,7,0,1,2 target = 0
// 0,1,2
// 0,1
// 0
