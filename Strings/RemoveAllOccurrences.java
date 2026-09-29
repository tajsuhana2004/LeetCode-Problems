/* Question Number 1910
REMOVE ALL OCCURRENCES OF A STRING

Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:
Find the leftmost occurrence of the substring part and remove it from s.
Return s after removing all occurrences of part.

A substring is a contiguous sequence of characters in a string.

Example 1:

Input: s = "daabcbaabcbc", part = "abc"
Output: "dab"
Explanation: The following operations are done:
- s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
- s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
- s = "dababc", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".*/


public class RemoveAllOccurrences {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        int m=part.length();

        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            
            if(sb.length() >=m){
                String sub = sb.substring(sb.length()-m);
                if(sub.equals(part)){
                    sb.setLength(sb.length()-m);
                }
            }
        }
        return sb.toString();
        
    }
    
}
