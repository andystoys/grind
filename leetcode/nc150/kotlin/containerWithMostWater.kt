// https://leetcode.com/problems/container-with-most-water/
class Solution {
    fun maxArea(height: IntArray): Int {
        // return bruteForce(height)
        return window(height)
    }
    
    /* 
        https://leetcode.com/problems/container-with-most-water/discuss/6089/Anyone-who-has-a-O(N)-algorithm/7268
        Start with widest container, l = 0 and r = n - 1. Let's say the left one is shorter: h[l] < h[r]. 
        Then, this is already the largest container the left one can possibly form. There's no need to consider it again. 
        Therefore, we just throw it away and start again with l = 1 and r = n -1.
    */
    // T: O(n), S: O(1), passes
    fun window(height: IntArray): Int {
        // odds exact, evens between (height.size/2-1, height.size/2) slightly larger, more on left
        var l = 0
        var r = height.size-1
        var max = 0
        while(l < r) {
            max = Math.max(max, (r-l) * Math.min(height[l], height[r]))
            if (height[l] > height[r]) r-- else l++
        }
        return max
    }
   
    // biggest + 2nd biggest
    
    
    // T: O(n^2), S: O(1), time exceeds
    fun bruteForce(height: IntArray): Int {
        var max = 0
        for (i in 0 until height.size) {
            for (j in i+1 until height.size) {
                val area = (j - i) * Math.min(height[i], height[j])
                max = Math.max(max, area)
            }
        }
        return max
    }
}
