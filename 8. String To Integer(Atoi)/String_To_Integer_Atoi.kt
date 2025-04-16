class Solution {
    fun myAtoi(s: String): Int {
        val INT_MIN = -2147483648
        val INT_MAX = 2147483647
        val map = mapOf(
            '0' to 0, '1' to 1, '2' to 2, '3' to 3, '4' to 4,
            '5' to 5, '6' to 6, '7' to 7, '8' to 8, '9' to 9
        )

        var value = 0
        var neg = false
        var i = 0
        val n = s.length

        while (i < n && s[i] == ' ') i++

        if (i < n && (s[i] == '+' || s[i] == '-')) {
            neg = s[i] == '-'
            i++
        }

        while (i < n && map.containsKey(s[i])) {
            val digit = map[s[i]]!!

            if (value > (INT_MAX - digit) / 10) {
                return if (neg) INT_MIN else INT_MAX
            }

            value = value * 10 + digit
            i++
        }

        return if (neg) -value else value
    }
}
