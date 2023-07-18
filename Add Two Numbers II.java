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
  private ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next= current.next;
            current.next=pre;
            pre=current;
            current=next;

        }
        return pre;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode ptr =result;
        int carry=0;
        l1=reverseList(l1);
        l2=reverseList(l2);
        while(l1!=null || l2!=null){
            int sum= 0+carry;
            if(l1!=null){
            sum+=l1.val;
            l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum /10;
            sum=sum % 10;
            ptr.next= new ListNode(sum);
            ptr=ptr.next;

        }

        if(carry!=0){
            ptr.next=new ListNode(1);
        }
        return  reverseList(result.next);
    }
}
