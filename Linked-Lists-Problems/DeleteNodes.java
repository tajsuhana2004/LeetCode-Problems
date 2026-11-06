/*
Question 2 :
Delete N Nodes After M Nodes of a Linked List
We have a linked list and two integers M and N. Traverse the linked list such that you retain M
nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level:
Rookie.
Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8
Sample Output 1 : 1->2->5->6
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode prev = head;
        ListNode curr = head;

        while (curr != null) {
            // Step 1: Skip m nodes
            for (int i = 0; i < m && curr != null; i++) {
                prev = curr;
                curr = curr.next;
            }
            // Step 2: Delete next n nodes
            for (int i = 0; i < n && curr != null; i++) {
                curr = curr.next;
            }
            // Step 3: Connect m-th to (m+n+1)-th
            prev.next = curr;
        }
        return head;
    }
}

public class DeleteNodes {
    public static ListNode createList(int[] arr) {
        if (arr.length == 0)
            return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int m = 2, n = 2;

        ListNode head = createList(arr);

        System.out.print("Original: ");
        printList(head);

        Solution obj = new Solution();
        head = obj.deleteNodes(head, m, n);

        System.out.print("After deleting " + n + " nodes after " + m + " nodes: ");
        printList(head);
    }
}