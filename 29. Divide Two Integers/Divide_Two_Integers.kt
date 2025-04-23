class Solution {
    fun divide(dividend: Int, divisor: Int): Int {

    if (dividend == Int.MIN_VALUE && divisor == -1) {
    return Int.MAX_VALUE
}
if ( divisor == 1) {
    return dividend
}

     var sign=true //true indicates positive
     if((dividend >0 && divisor<0) || (dividend <0 && divisor>0)) sign= false

     var num=Math.abs(dividend.toLong())
    
     val num2= Math.abs(divisor.toLong())
    var sol=0
    while(num>=num2){
        num -=num2
        sol++
    }
    if(sign) return sol

    return 0-sol 

    }
}