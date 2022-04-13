// https://leetcode.com/problems/top-k-frequent-elements/submissions/
class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val ans = mutableListOf<Int>()
        val tmp = List<MutableList<Int>>(nums.size) { mutableListOf() }
        val map = mutableMapOf<Int, Int>()
        for (n in nums) {
            val prevCount = map.get(n) ?: 0 
            map.put(n, prevCount + 1)
        }

        // println(map)
        for (entry in map.entries.iterator()) {
            tmp[entry.value-1].add(entry.key)
        }

        for (f in tmp.asReversed()) {
            if (f.isNotEmpty()) {
                for (i in f) {
                    ans.add(i)
                    if (ans.size >= k) break
                }
            }
            if (ans.size >= k) break
        }
        return ans.toIntArray()
    }
    
    fun topKFrequent2(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEach { map[it] = map.getOrDefault(it, 0) + 1 }

        val uniques = mutableListOf<Int>()
        val pairs = map.toList().sortedByDescending { it.second }

        pairs.forEach {
            while (uniques.size < k) {
                uniques.add(it.first)
                return@forEach
            }
            println(uniques.size)
        }

        return uniques.toIntArray()
    }
    
    // TODO: priority queue, Quickselect (Hoare's selection algorithm)
}
