/*
Question Number 567
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // first window
        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        if (isSame(freq1, freq2)) return true;

        // slide
        for (int i = s1.length(); i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++; // add new char
            freq2[s2.charAt(i - s1.length()) - 'a']--; // remove old char

            if (isSame(freq1, freq2)) return true;
        }

        return false;
    }

    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i]!= b[i]) return false;
        }
        return true;
    }
}
        
    
