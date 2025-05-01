class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val list= mutableListOf<List<Int>>()
        val n = nums.size
        nums.sort()
         
        for (i in 0 until n-3 ){

            if(i!=0 && nums[i]==nums[i-1]) continue
   
        for(j in i+1 until n-2){
            if( j>i+1 && nums[j]==nums[j-1])  continue
                
        var l=j+1
        var r=nums.lastIndex
        while(l<r){
            val sum = 1L* nums[i]+ nums[j] +nums[l] +nums[r]
            if(sum== target.toLong()){
                list.add(listOf(nums[i],nums[j],nums[l],nums[r]))

                while (l < r && nums[l] == nums[l + 1]) l++
                while (l< r && nums[r] == nums[r - 1]) r--

                            l++
                            r--
            }
            else if(sum <target){
                l++
                // while (l<r && nums[l]==nums[l+1] ) l++
            }
            else {
                r--
                // while(l<r && nums[r]==nums[r-1]) r--
            }
        }
        }
        
        }

        return list
    }
}