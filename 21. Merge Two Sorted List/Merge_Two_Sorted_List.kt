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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result=ListNode(0)
        var tail=result

        var p1=list1
        var p2=list2

        while(p1!=null && p2!=null){
            if(p1.`val`==p2.`val` || p1.`val`<p2.`val`){
                tail.next=p1
                p1=p1.next
            }
            else{
                tail.next=p2
                p2=p2.next
              
            }
            tail=tail.next
        }

        tail.next=p1?:p2


        return result.next
    }
}