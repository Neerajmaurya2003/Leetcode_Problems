class Solution {
    fun longestPalindrome(s: String): String {
        if(s.length==1) return s
     val substrings=mutableListOf<String>()
    var target=""
     for (i in s.indices){
       var j=i+1
        while( j<s.length){
             if(s[j]==s[i]){
            substrings.add(s.slice(i..j))
        }
            j++
        }
     }  
    substrings.sortBy{it.length}
    for (i in substrings.size - 1 downTo 0) {
    val str = substrings[i]
    var isPalindrome = true
    for (j in 0 until str.length / 2) {
        if (str[j] != str[str.length - 1 - j]) {
            isPalindrome = false
            break
        }
    }
    if (isPalindrome) {
        target = str
        return target
    }
}
    if(target=="") return s[0].toString()
    return target

    }
}