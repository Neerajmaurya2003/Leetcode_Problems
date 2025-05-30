class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        nums.sort()
        val n = nums.size
    for ( i in 0 until n-2){
        if( i>0 && nums[i]==nums[i-1]) continue

        var l=i+1
        var r=nums.lastIndex
    while( l<r){
        val sum=nums[i]+nums[l]+ nums[r]
when {
    sum ==0-> {
        list.add(listOf(nums[i],nums[l],nums[r]))
        l++
        r--
       while (l < r && nums[l] == nums[l - 1]) l++
        while (l < r && nums[r] == nums[r + 1]) r--
    }
    sum<0 -> l++
    else-> r--
}
    }

    }
     return list
    }
}