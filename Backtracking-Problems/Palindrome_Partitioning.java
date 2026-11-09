/*
Question number : 131
Palindrome Partitioning

Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 */

import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(0, s, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int index, String s,
            List<String> path,
            List<List<String>> result) {

        // Base case
        if (index == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        // Try all possible partitions
        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s, index, i)) {

                // Choose
                path.add(s.substring(index, i + 1));

                // Explore
                backtrack(i + 1, s, path, result);

                // Backtrack
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
