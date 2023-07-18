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
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode fast=head;
    ListNode prev=null;
    ListNode curr=fast;
    int count =0;
    int len=0;
    
    if(getLength(head)<k && curr!=null){
        return curr;
    }
    else{
        while(curr!=null && count<k){
            curr=fast.next;
            fast.next=prev;
            prev=fast;
            fast=curr;
            count++;
        }
       if(curr!=null){
            head.next=reverseKGroup(curr, k);
        }
    
    }
    return prev;

    }
   

    private int getLength(ListNode head){
       int length =0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }

}
