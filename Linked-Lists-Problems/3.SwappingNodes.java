/*Question 3 :
Swapping Nodes in a Linked List

We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
swapped by changing links. Swapping data of nodes may be expensive in many situations when
data contains many fields. It may be assumed that all keys in the linked list are distinct.
Sample Input 1 : 1->2->3->4, x = 2, y = 4
Sample Output 1 : 1->4->3->2

 */

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;

        // find kth from start
        for (int i = 1; i < k; i++)
            first = first.next;

        // find kth from end using two pointers
        temp = first;
        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // swap values
        int t = first.val;
        first.val = second.val;
        second.val = t;

        return head;
    }
}