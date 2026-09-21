/* Question number:242 Valid Anagram
Determine if 2 Strings are anagrams of each other.
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Note : What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not.
 */


public class Anagram {
    public static boolean isAnagram(String s, String t){
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        int count[]=new count[26];
        for(int i=0;i<m;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
            return true;
        }
    }
    
}
