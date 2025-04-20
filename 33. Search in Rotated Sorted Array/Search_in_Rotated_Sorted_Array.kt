class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var low = 0
        var high = n - 1

        while (low < high) {
            val mid = (low + high) / 2
            if (nums[mid] > nums[high]) {
                low = mid + 1
            } else {
                high = mid
            }
        }
        val pivot = low
        low = 0
        high = n - 1

        while (low <= high) {
            val mid = (low + high) / 2
            val realMid = (mid + pivot) % n
            when {
                nums[realMid] == target -> return realMid
                nums[realMid] < target -> low = mid + 1
                else -> high = mid - 1
            }
        }

        return -1
    }
}
