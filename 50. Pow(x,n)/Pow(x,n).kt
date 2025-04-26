class Solution {
    fun myPow(x: Double, n: Int): Double {
        if(x==1.0 ||( x==-1.0 && n%2==0)){
            return abs(x)
        }
        if(x==-1.0 && n%2!=0){
            return x
        }
        var value =1.0
        val flag=if(n>0) true else false
        if (n==Int.MIN_VALUE){
            return 0.0
        }
        val n1=abs(n)
        for ( i in 0 until n1){
            if(flag){
                value *= x
            }
            else{
                value /=x
            }
        }

        return value
    }
}