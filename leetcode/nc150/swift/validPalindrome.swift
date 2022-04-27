// https://leetcode.com/problems/valid-palindrome/
class Solution {
    func isPalindrome(_ s: String) -> Bool {
        let pattern = "[^A-Za-z0-9]+"
        let clean = s.replacingOccurrences(of: pattern, with: "", options: [.regularExpression])
            .replacingOccurrences(of: " ", with: "").lowercased()

        return clean == String(clean.reversed())
    }
}
