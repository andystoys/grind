// https://leetcode.com/problems/group-anagrams/submissions/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap();
       
        // loop chars + hashmap to store the values
        for (String s: strs) {
            char[] hash = new char[26];
            for (char c: s.toCharArray()) {
                hash[c-'a']++;
            }
            String str = new String(hash);
            if (map.get(str) == null) map.put(str, new ArrayList<>());
            map.get(str).add(s);
        }
    
        // add all values back to l        
        l.addAll(map.values());

        return l;
    }
}
