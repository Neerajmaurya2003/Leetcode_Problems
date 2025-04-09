
class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return true // An empty string is considered valid

        val stack = ArrayDeque<Char>()

        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.push(char)
                ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
                '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
                ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
            }
        }

        return stack.isEmpty()
    }
}