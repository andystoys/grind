// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
      // Hashmap: key[target - value] exists? return indecies, T = O(n), S = O(n)
      // Sliding Window: T = O(n), S =O(1)
        int l = 0;
        int r = numbers.length-1;
        while (l <= r) {
            int value = numbers[l] + numbers[r];
            if (value == target) break;
            else if (value < target) ++l;
            else --r;
        }
        return new int[]{l+1, r+1}; // assumes a solution exists
    }
}
