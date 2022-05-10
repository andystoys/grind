// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

import kotlin.math.min
import kotlin.math.max

class Solution {
    // T: O(n^2), S: O(1)
    fun maxProfit3(prices: IntArray): Int {
        var profit = 0
        
        for (i in 0 until prices.size-1) {
            for (j in i+1 until prices.size) {
                val diff = prices[j] - prices[i]
                if (diff > profit) profit = diff 
                //.takeIf { diff > profit } ?: profit
            }
        }
        
        return profit
    }
    
    // T: O(n), S: O(1)
    fun maxProfit2(prices: IntArray): Int {
        var curProfit = 0
        var maxProfit = 0
        
        for (i in 0 until prices.size-1) {
            val diff = prices[i+1] - prices[i]
            if (curProfit + diff > 0)  curProfit += diff else curProfit = 0
            if (curProfit > maxProfit) maxProfit = curProfit
        }
        
        return maxProfit
    }
    
    // T: O(n), S: O(1)
    fun maxProfit3(prices: IntArray): Int {
        if(prices.isEmpty()) return 0

        var profit = 0
        var lowestPrice = prices[0]

        // var result = 0
        // var min = Int.MAX_VALUE
        
        prices.forEach { currentPrice ->
            lowestPrice = min(lowestPrice, currentPrice)
            profit = max(currentPrice - lowestPrice, profit)
        }

        return profit
    }
}
