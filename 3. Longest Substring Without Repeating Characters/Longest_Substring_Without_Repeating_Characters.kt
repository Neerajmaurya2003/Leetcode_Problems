class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var y=0
        val list = mutableSetOf<Char>()
        var count=0
        for (x in s.indices){
            while(s[x] in list){
                list.remove(s[y])
                y++
            }
           
           list.add(s[x])
           count=maxOf(count,x-y+1)
        }
        return count
    }
}