// https://leetcode.com/problems/longest-consecutive-sequence/submissions/
class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Arrays.sort(nums); // Time: nlogn quicksort
        
        int count = 1;
        for (int i = 0; i < nums.length-1; ++i) { // Time: n
            if (nums[i] + 1 == nums[i+1]) ++count;
            else if (nums[i] + 1 < nums[i+1]) count = 1;
            if (count > longest) longest = count;
        }
        if (nums.length > 0) longest = Math.max(longest, 1);
        return longest;
        
        // Time: nlogn + n --> n
    }
    
    // Use set
    
    // Hashmap
}
