// https://leetcode.com/problems/valid-anagram/
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        //return sortCompare(s, t)
        //return hashMap(s, t)
        return hashMap2(s, t)
    }
    
    fun hashMap2(s: String, t: String): Boolean {
        val freqMap: MutableMap<Char, Int> = mutableMapOf() // Create hashmap of character to count
        s.forEach { freqMap.put(it, freqMap.getOrDefault(it, 0) + 1) } // For every character in s, increment count by 1
        t.forEach { freqMap.put(it, freqMap.getOrDefault(it, 0) - 1) } // For every character in t, decrement count by 1
        return freqMap.filter { it.value != 0 }.size == 0 // Filter all elements in freqMap where count is not 0 and return if there are more than 0 characters left
    }
    
    // T: O(n), S: O(n)
    fun hashMap(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Int>()
        
        if (s.length != t.length) return false
        
        s.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        t.forEach {
            val value = map.getOrDefault(it, 0)
            if (value <= 0) return false
            map[it] = value - 1
        }
        return true
    }
    
    // T: O(nlog), S: O(1)
    fun sortCompare(s: String, t: String): Boolean { return s.toCharArray().sorted() == t.toCharArray().sorted() }
}
