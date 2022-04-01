class Solution {
    fun maximumWealth1(accounts: Array<IntArray>): Int {
        var wealthiest = 0
    
        for (i in accounts.indices) {
            var localSum = 0
            for (j in accounts[i].indices) {
               localSum += accounts[i][j] 
            }
            if (i == 0) wealthiest = localSum
            else if (localSum > wealthiest) wealthiest = localSum
        }
        
        return wealthiest
    }
    
    // Other solutions, leetcode isn't using the latest version of Kotlin
    fun maximumWealth2(accounts: Array<IntArray>): Int = accounts.maxBy { it.sum() }!!.sum()
    // use: maxByOrNull -> accounts.maxByOrNull { it.sum() }?.sum() ?: 0
    
    // Map reduce
    fun maximumWealth3(accounts: Array<IntArray>) = accounts.map { it -> it.reduce { acc, value -> acc + value } }.max() ?: 0
    // fun maximumWealth(accounts: Array<IntArray>) = accounts.map { it -> it.reduce { acc, value -> acc + value } }.maxByOrNull { it } ?: 0
}
