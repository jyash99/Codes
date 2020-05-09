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
        if(l1 == null && l2 == null) {
            return null;
        }
        int carry = 0;
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int c = 0;
        while(l1 != null || l2 != null) {
            int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            carry = sum / 10;
            ListNode l4 = new ListNode(sum % 10);
            l3.next = l4;
            if(c == 0) {
                head = l3.next;
                c = 1;
            }
            l3 = l4;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
            if(l1 == null && l2 == null && carry != 0) {
                ListNode l5 = new ListNode(carry);
                l3.next = l5;
            }
        }
        return head;
    }
}