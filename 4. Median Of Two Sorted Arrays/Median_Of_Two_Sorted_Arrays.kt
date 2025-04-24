class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
   
   val list1=nums1.toMutableList()
        list1.addAll(nums2.toMutableList())
        val list=list1.sorted()
        if(list.size%2 !=0){
            return list[list.size/2].toDouble()
        }
        val n=list.size
        val result=(list[(n/2)-1]+list[n/2])/2.0
            return result.toDouble()
    }
}