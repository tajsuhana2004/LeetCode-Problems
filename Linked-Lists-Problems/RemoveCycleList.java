/* 
Questions 142: Removing Cycle in Linked List

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list. */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Step 1 - Detect cycle using your isCycle logic
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return null;
        }

        // Step 2 - Find meeting point / start of cycle
        // This is your "find meeting point" part from notebook
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // start of cycle - LeetCode 142 asks this
    }
}
