// Last updated: 6/29/2026, 5:24:22 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode slow = dummy;
16        ListNode fast = dummy;
17        for(int i = 0 ; i < n; i++){
18            fast = fast.next;
19            if(fast.next == null)return head.next;
20        }
21        if(fast.next == null)return head.next;
22        while(fast.next != null){
23            slow = slow.next;
24            fast = fast.next;
25        }
26        slow.next = slow.next.next;
27        return dummy.next;
28    }
29}