class Solution {
    // T: O(n^2), S: O(1)
    // Brute Force
    fun containsDuplicate1(nums: IntArray): Boolean {
        for (i in 0 until nums.size) {
            for (j in i+1 until nums.size) {
                if (nums[i] == nums[j]) return true
            }
        }
        return false
    }        
    
    // T: O(nlogn), S: O(1)
    // Sort
    fun containsDuplicate2(nums: IntArray): Boolean {
        nums.sort()
        for(i in 1 until nums.size) {
            if (nums[i] == nums[i-1]) return true
        }
        return false
    }
    
    // T: O(n), S: O(n)
    // Set/Map
    fun containsDuplicate3(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (n in nums) {
            if (map[n] == null) map[n] = n
            else return true
        }
        return false
    }
    
    // Cool 1 liner
    fun containsDuplicate4(nums: IntArray): Boolean = nums.size > nums.toSet().size
}
