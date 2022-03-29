// https://leetcode.com/problems/concatenation-of-array/submissions/
class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val b = IntArray(n * 2)
        // for (i in nums.indices) {
        for (i in 0 until n) {
            b[i] = nums[i]
            b[i+n] = nums[i]
        }
        return b
    }
    
    fun getConcatenation2(nums: IntArray): IntArray = IntArray(nums.size * 2).mapIndexed { i, v -> nums[i % nums.size] }.toIntArray()
    
    // Other solutions
    fun getConcatenation3(nums: IntArray): IntArray = IntArray(nums.size * 2) { nums[it % nums.size] }
    
    fun getConcatenation4(nums: IntArray) = intArrayOf(*nums, *nums)
    
    fun getConcatenation5(nums: IntArray) = nums + nums
}
