class Solution {
    fun romanToInt(s: String): Int {
        var prev=0
        var intvalue=0
        val values=mapOf('I' to 1,'V' to 5,'X' to 10,'L' to 50,'C' to 100,'D' to 500,'M' to 1000 )
        for(x in s.length- 1 downTo 0){
            val current = values[s[x]] ?: 0
          if(current<prev){
            intvalue -=current
          }
          else{
            intvalue += current
          }
          prev=current
        }
        return intvalue
    }
}