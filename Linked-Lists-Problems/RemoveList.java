/* Question 19:
   Remove nth node from the list

   Given the head of a linked list, remove the nth node from the end of the list and return its head.

 
    */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // calculate size
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return head;
        }

        int i = 1;
        int iTofind = sz - n;
        ListNode prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}