// Last updated: 6/29/2026, 5:15:44 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        if(list1 == null)return list2 ;
14        if(list2 == null)return list1;
15        ListNode res ;
16        if(list1.val < list2.val){
17            res = list1;
18            res.next = mergeTwoLists(list1.next, list2);
19        }else{
20            res = list2 ;
21            res.next = mergeTwoLists(list1, list2.next);
22        }
23        return res;
24    }
25}