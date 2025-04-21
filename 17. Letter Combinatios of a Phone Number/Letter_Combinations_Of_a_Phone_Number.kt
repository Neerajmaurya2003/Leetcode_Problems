class Solution {
    fun letterCombinations(digits: String): List<String> {
        
        val map=mapOf(
            '2' to listOf("a","b","c"),
            '3' to listOf("d","e","f"),
            '4' to listOf("g","h","i"),
            '5' to listOf("j","k","l"),
            '6' to listOf("m","n","o"),
            '7' to listOf("p","q","r","s"),
            '8' to listOf("t","u","v"),
            '9' to listOf("w","x","y","z")
        )
        val list= mutableListOf<String>()
        for (i in digits.indices){
           
                if(i==0){
                    list.addAll(map[digits[i]]?:continue)
                }
                else{
                    val temp=list.toList()
                    list.clear()
                     for(j in map[digits[i]]!!){
                   for(k in temp){
                    list.add(k+j)
                }
                     }
                }
            }
        

        return list
    }
}