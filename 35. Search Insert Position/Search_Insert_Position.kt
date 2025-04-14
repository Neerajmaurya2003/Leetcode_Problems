class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low=0
        var high=nums.size
        var mid=low+high/2
        while(low<high ){
            if(nums[mid]>target){
                high=mid
            }
            else if(nums[mid]==target){
                return mid
            }
            else{
                low=mid+1
            }
            mid=(low+high)/2
        }
        return mid
    }
}