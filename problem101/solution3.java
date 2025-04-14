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
    ListNode cur;
    public boolean isPalindrome(ListNode head) {
        cur=head;
        palindrome(head);
    }
    public boolean palindrome(ListNode head)
    {
        if(head==null)
        {
            return true;
        }
        boolean ans=palindrome(head.next)&&head.val==cur.val;
        cur=cur.next;
        return ans;
    }
}
