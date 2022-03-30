class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var a = IntArray(nums.size)
        for (i in nums.indices) {
            a[i] = nums[i] + if (i > 0) a[i-1] else 0
        }
        return a
    }
    
    // other solutions
    fun runningSum2(nums: IntArray): IntArray {
        var sum = 0
        return nums.map{sum += it; sum}.toIntArray()
    }
    
    fun runningSum3(nums: IntArray): IntArray {
        for (i in 1 until nums.size) nums[i] += nums[i-1]
        return nums
    }
}
