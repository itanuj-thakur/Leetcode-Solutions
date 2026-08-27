// Title: Valid Palindrome
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-palindrome/

            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                st.append(c);
            }
        }
        
        // Compare the string builder to its reversed self
        String original = st.toString();
        String reversed = st.reverse().toString();
        
        for (int i = 0; i < s.length(); i++) {
        
        StringBuilder st = new StringBuilder();
    public boolean isPalindrome(String s) {
class Solution {
