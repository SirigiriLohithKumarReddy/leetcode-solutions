/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
     ListNode front = head;
      while(front!=null && front.next != null){
        if(front.val == front.next.val){
            front.next = front.next.next;
        }
        else{
            front = front.next;
        }
      }
      return head;
    }
}