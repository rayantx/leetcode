package MergeTwoSortedLists;

import java.lang.classfile.components.ClassPrinter;

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
class Solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode test = new ListNode(0);
        ListNode currently = test;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currently.next = list1;
                list1 = list1.next;
            } else {
                currently.next = list2;
                list2 = list2.next;
            }
            currently = currently.next;
        }
        currently.next = list1 != null ? list1 : list2;
        return test.next;
    }
}