// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
class Solution {
    // T: O(n), S: O(min(m, n)), where m is size of charset
    fun lengthOfLongestSubstring(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        var l = 0
        var r = 0
        var res = 0

        while (r < s.length) {
            if (map.contains(s[r])) l = Math.max(map.getOrDefault(s[r], 0), l) // This is the part I missed, can add the skip here
            res = Math.max(res, r - l + 1) // this line and bottom order don't matter for correctness
            map[s[r]] = r + 1 // want to skip
            r++
        }
        
        return res
    }
    // TODO: Try solving using charset
}
