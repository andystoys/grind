# [Find one/all duplets](https://leetcode.com/problems/two-sum/)
ex: [2,7,11,15], target = 9

## Considerations
- Reuse same values?
- Dups
- -/0/+ numbers
- Solution exists?
- Range of values

## Variations
- Return one duplet
- Return all duplets

## Care
- Double counting with hashmap

## Tactics
1. Brute force: Time O(n^2), Space O(1)
2. Hashmap: Time O(n), Space O(n)
3. Sort + Binary Search: Time O(nlogn), Space O(1) 


---
Find all triplets

---
Find all quadruplets that sum to a target number
ex: [1,0,-1,0,-2,2], target = 0
results can be in any order

- Group into duplets
- Similar to duplets problem store sum as key in hashtable with array of duplets equal to the value
- Care not double count pairs ex: [1, 0], [0, 1]
  - Add on second pass
- 
