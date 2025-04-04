/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1=l1
        var l2=l2
       var carry=0

       val dummy=ListNode(0)
       var current=dummy

       while(l1 !=null || l2!=null || carry !=0){
       val sum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + carry
        carry =sum/10
        current.next=ListNode(sum%10)

        current=current.next!!
        l1=l1?.next
        l2=l2?.next
       }
       return dummy.next

    }
}