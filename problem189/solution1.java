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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur=new ListNode(0);
        ListNode temp=cur;
        int ca=0;
        while(l1!=null||l2!=null||ca!=0)
        {
            int s=ca;
            if(l1!=null)
            {
                s=s+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                s=s+l2.val;
                l2=l2.next;
            }
            temp.next=new ListNode(s%10);
            ca=s/10;
            temp=temp.next;
        }  
        return cur.next;
    }
}
