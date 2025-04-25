class Solution {
    fun addBinary(a: String, b: String): String {
        val s= StringBuilder()
        var carry=0
        val str1=a.reversed()
        val str2=b.reversed()
        var ptr=0
        var maxsize=maxOf(str1.length,str2.length)
        while(ptr<maxsize || carry != 0){

        val bit1=if(ptr<str1.length) str1[ptr]-'0' else 0
        val bit2=if(ptr<str2.length) str2[ptr]-'0' else 0

        val sum =bit1 + bit2 + carry
        s.append((sum%2).toString())
        carry=sum/2
        ptr++

        }
        
        return s.reversed().toString()    
    }
}