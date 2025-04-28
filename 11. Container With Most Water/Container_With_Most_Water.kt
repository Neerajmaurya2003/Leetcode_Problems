class Solution {
    fun maxArea(height: IntArray): Int {
       var max=0

    //Time Complexity is O(n). which satisfy all test cases
       var i=0
       var j=height.size-1

       while(i<j){
        val l=j-i
        val b= minOf(height[i],height[j])
        val area= l*b
        max=maxOf(area,max)

        if(height[i]<height[j]){
            i++
        }
        else{
            j--
        }

       }





    //Time Complexity is O(n^2) which exceeded time limit

    // for ( i in height.indices){
    //     var j=i+1
    //     while(j<height.size){
    //         val length=j-i
    //         val breadth=minOf(height[i],height[j])
    //         val area=length*breadth
    //         if(area>max){
    //             max=area
    //         }
    //         j++
    //     }
    // }


    
    return max

    }
}