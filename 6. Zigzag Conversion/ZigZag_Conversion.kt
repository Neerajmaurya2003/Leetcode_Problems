class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s

        val rows = MutableList(numRows) { StringBuilder() }
        var currRow = 0
        var goingDown = false

        for (c in s) {
            rows[currRow].append(c)

            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown
            }

            currRow += if (goingDown) 1 else -1
        }

        return rows.joinToString("") { it.toString() }
    }
}
