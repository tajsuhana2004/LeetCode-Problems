 /*Question 151
 Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. 
The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the" */
 
 
 public class ReverseString {
    public String reverseWords(String s) {
    
        int n = s.length();
        String ans = "";

        // reverse whole string 
        String rev = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < n; i++) {
            String word = "";
            while (i < n && rev.charAt(i)!= ' ') {
                word += rev.charAt(i);
                i++;
            }
            // reverse word back 
            word = new StringBuilder(word).reverse().toString();
            if (word.length() > 0) {
                ans += " " + word;
            }
        }
        return ans.substring(1); // remove first space
    }

    
}
