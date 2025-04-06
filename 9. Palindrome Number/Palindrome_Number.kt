class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x<0){
            return false;
        }
        else{
            var a=0;
            var b=x;
            while(b!=0){
                var c=b%10;
                a=a*10+c;
                b=b/10;
            }
            if(a==x){
                return true;
            }
            else{
                return false;
            }
     }
    }
}