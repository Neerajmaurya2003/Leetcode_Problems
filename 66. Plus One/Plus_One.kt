class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val list = digits.toMutableList()

        for (i in list.size - 1 downTo 0) {
            if (list[i] < 9) {
                list[i]++
                return list.toIntArray()
            } else {
                list[i] = 0
            }
        }

        list.add(0, 1)
        return list.toIntArray()
    }
}
