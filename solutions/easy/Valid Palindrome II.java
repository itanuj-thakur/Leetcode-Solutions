// Title: Valid Palindrome II
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-palindrome-ii/

    // Standard palindrome helper (0 deletions allowed)
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
