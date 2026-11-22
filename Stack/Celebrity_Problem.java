/*
Celebrity Problem
Question:
In a party of N people, a celebrity is defined as a person who:
Knows nobody - Celebrity does not know anyone.Everybody knows the celebrity - Everyone else knows the celebrity.You are given a matrix M of size N x N where M[i][j] == 1 means person i knows person j, otherwise M[i][j] == 0.
Find the celebrity. If there is no celebrity, return -1.
Example:javascriptInput: M = [[0,1,0],
            [0,0,0],
            [0,1,0]]
Output: 1
Explanation: Person 1 knows nobody, and everyone knows person 1. */

class Solution {
    public int celebrity(int[][] M) {
        int n = M.length;
        int top = 0;
        int bottom = n - 1;

        // 1. Find candidate by elimination
        while (top < bottom) {
            if (M[top][bottom] == 1) {
                // top knows bottom, so top cannot be celebrity
                top++;
            } else {
                // top does not know bottom, so bottom cannot be celebrity
                bottom--;
            }
        }

        int candidate = top;

        // 2. Verify candidate
        for (int i = 0; i < n; i++) {
            if (i == candidate)
                continue;
            // Celebrity should know nobody AND everyone should know celebrity
            if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
}
