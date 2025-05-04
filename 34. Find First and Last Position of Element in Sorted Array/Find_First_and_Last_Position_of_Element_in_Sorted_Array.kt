class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        
          fun findFirst(): Int {
            var left = 0
            var right = nums.lastIndex
            var result = -1
            while (left <= right) {
                val mid = (left + right) / 2
                if (nums[mid] == target) {
                    result = mid
                    right = mid - 1  // keep searching left
                } else if (nums[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            return result
        }

        fun findLast(): Int {
            var left = 0
            var right = nums.lastIndex
            var result = -1
            while (left <= right) {
                val mid = (left + right) / 2
                if (nums[mid] == target) {
                    result = mid
                    left = mid + 1  // keep searching right
                } else if (nums[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            return result
        }

        return intArrayOf(findFirst(), findLast())
    }
}