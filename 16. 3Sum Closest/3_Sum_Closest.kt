class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        val n = nums.size
        var min=Int.MAX_VALUE
        var result=0
     nums.sort()
    for( i in 0 until n-2){
        if(i>0 && nums[i]==nums[i-1]) continue

        var l=i+1
        var r=nums.lastIndex
        while(l<r){
            val sum =nums[i] + nums[l] + nums[r]
            val diff= abs(target-sum)
           if(diff<min){
            min =diff
            result=sum
           }
        if(sum >target){
                    r--
                while (l<r && nums[r]==nums[r+1] ) r--

                }
        else if(sum<target){
                    l++
                while (l<r && nums[l]==nums[l-1]) l++   

                }
                else{
                    return target
                }
        }
    }
        return result

    }
}