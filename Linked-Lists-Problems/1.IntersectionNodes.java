/* Question 1 :
Intersection of Two Linked Lists
In a system there are two singly linked list. By some programming error, the end node of one
of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a
program to get the point where two linked lists merge. */

package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode curr1 = headA;
        ListNode curr2 = headB;

        while (curr1 != curr2) {
            curr1 = (curr1 == null) ? headB : curr1.next;
            curr2 = (curr2 == null) ? headA : curr2.next;
        }

        return curr1; // returns intersection node or null if no intersection
    }
}