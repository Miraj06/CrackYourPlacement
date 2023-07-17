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
    public boolean isPalindrome(ListNode head) {
      ListNode fast=head;
      int num=0;
      int rev=0;
      int mul=1;
      while(fast!=null){
          num=num*10+fast.val;
          rev=rev+fast.val * mul;
          mul*=10;

          fast=fast.next;
      }

      if(num!=rev){
          return false;
      }

      return true;
}
}
