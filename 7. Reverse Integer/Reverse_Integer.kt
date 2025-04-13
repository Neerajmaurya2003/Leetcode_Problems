class Solution {
    fun reverse(x: Int): Int {
        var b=x
        var rev=0
        while(b!=0){
         val temp=b%10
            if (rev > Int.MAX_VALUE / 10 || (rev == Int.MAX_VALUE / 10 && temp > 7)) return 0
            if (rev < Int.MIN_VALUE / 10 || (rev == Int.MIN_VALUE / 10 && temp < -8)) return 0
         rev=rev*10+temp
         b=b/10
        }
        return rev
    }
}