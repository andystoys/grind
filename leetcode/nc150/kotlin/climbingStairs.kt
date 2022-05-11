// https://leetcode.com/problems/climbing-stairs/submissions/
/*
    Min step?
    Max step?
    ---
    
    1 -> 1 -> 1
    2 -> 1,1 | 2 -> 2
    3 -> 1,1,1 | 1,2 | 2,1 -> 3
    4 -> 1,1,1,1 | 1,1,2 | 1,2,1 | 2,1,1 | 2,2
*/
class Solution {
    fun climbStairs(n: Int): Int {
        return runner3(n)
    }
    
    // T: O(2^n) -> fib, S: O(h) where h is height of tree, time exceeds
    // Top -> Down
    fun runner(n: Int): Int {
        return when {
            n < 0  -> 0
            n == 0 -> 1
            else   -> runner(n-1) + runner(n-2)
        }
    }
    
    // T: O(2^n), S: O(1)
    fun runner2(n: Int): Int {
        var one = 1
        var two = 1
        for (i in 1 until n) {
            val tmp = one
            one += two
            two = tmp
        }
        return one   
    }
    
    // T: O(2^n), S: O(1)
    fun runner3(n: Int): Int {
        var result = 1
        var n1 = 1
        var n2 = 1

        (1 until n).forEach {
            result = n1 + n2
            n2 = n1
            n1 = result
        }
        
        return result
    }
}
