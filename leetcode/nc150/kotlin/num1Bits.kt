// https://leetcode.com/problems/number-of-1-bits/
class Solution {
    // you need treat n as an unsigned value
    // Kotlin, Ints are signed...supports pos/neg ints
    // 2^i + ... + 2^2 + 2^1 + 2^0
    // 11/2 = 5 -> 5/2 = 2 -> 2/2 = 1
    // 8 + 2 + 1 = 11
    
    // T: O(32) -> O(1), S: O(1)
    fun hammingWeight2(n:Int):Int {
        var res = 0u
        var m:UInt = n.toUInt()
        while (m > 0u) {
            res += m % 2u // u for unsigned int
            m /= 2u
            // m = m shr 1 // Need to use int and not unsigned Int here, alt bitshift way
        }
        return res.toInt()
    }
    
    fun hammingWeight(n:Int):Int {
        var res = 0
        var m:UInt = n.toUInt()
        while (m > 0u) {
            m = m and (m-1u)
            res += 1
        }
        return res
    }
}
