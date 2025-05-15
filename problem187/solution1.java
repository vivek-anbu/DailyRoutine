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
    public ListNode sortList(ListNode head) {
        
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        int arr[]=new int[count];
         temp=head;
         count=0;
        while(temp!=null)
        {
            arr[count++]=temp.val;
            temp=temp.next;
        }
         temp=head;
         count=0;
        Arrays.sort(arr);
        while(temp!=null)
        {
            temp.val=arr[count++];
            temp=temp.next;
        }
        return head;
    }
}
