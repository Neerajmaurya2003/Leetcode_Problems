class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val n = nums.size

        for (i in nums.indices) {
            while (nums[i] in 1..n && nums[nums[i] - 1] != nums[i]) {
                val correctIndex = nums[i] - 1
                nums[i] = nums[correctIndex].also { nums[correctIndex] = nums[i] }
            }
        }

        for (i in nums.indices) {
            if (nums[i] != i + 1) {
                return i + 1
            }
        }

        return n + 1
    }
}
