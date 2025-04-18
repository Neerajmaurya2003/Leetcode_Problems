class Solution {
    fun lengthOfLastWord(s: String): Int {
        val list=s.split(" ")
        for (i in list.reversed()){
            if(i.isEmpty()){
                continue
            }
            else{
                return i.length
            }

        }
        return list[list.size-1].length
    }
}