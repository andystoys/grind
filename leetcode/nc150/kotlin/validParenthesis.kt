class Solution {
    // import java.util.Stack
    // round, square, curly brackets
    // "()[]{}"
    // push, pop, peek
    // T: O(n), S: O(n)
    // Edge case: Single char: '[', ')'
    fun isValid2(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            if (c in arrayOf('[', '(', '{')) stack.push(c)
            else {
                if (stack.empty()) return false
                val openBracket = stack.pop()
                when (c) {
                    ']' -> if (openBracket != '[') return false
                    ')' -> if (openBracket != '(') return false
                    '}' -> if (openBracket != '{') return false
                }
            }
        }    
        return stack.empty()
    }
    
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            when (c) {
                in arrayOf('[', '(', '{') -> stack.push(c)
                ']' -> if (stack.empty() || !stack.empty() && stack.pop() != '[') return false
                ')' -> if (stack.empty() || !stack.empty() && stack.pop() != '(') return false
                '}' -> if (stack.empty() || !stack.empty() && stack.pop() != '{') return false
            }
        }    
        return stack.empty()
    }
}
