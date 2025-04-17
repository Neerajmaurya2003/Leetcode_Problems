class Solution {
    fun isPalindrome(s: String): Boolean {
        
       val str=s.filter{it.isLetterOrDigit()}.lowercase()

       if(str.isEmpty() || str.length==1) return true

        var i=0
        var j=str.length-1
        while(i<str.length/2 && i!=j){
           
            if(str[i]==str[j]){
                i++
                  j--
            }
            else{
                return false
            }
        }
        
        return true
    }
}