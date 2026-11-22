/*
Sort a Stack

Question:
Given a stack, sort it in ascending order such that the smallest element is on the top. You can use one extra temporary stack.Example:
Input: Stack [3, 2, 1] (Top = 1)
Output: Stack [3, 2, 1] (Sorted, Top = 1) */

import java.util.*;

public class Sort_Stack {
    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty()) {
            int curr = s.pop();

            while (!temp.isEmpty() && temp.peek() > curr) {
                s.push(temp.pop());
            }
            temp.push(curr);
        }
        return temp;
    }
}
