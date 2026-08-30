// Title: Sqrt(x)
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sqrt(x)/

        while (root * root > x) {
            root = (root + x / root) / 2;
        }
        return (int) root;
    }
        
        long root = x;
        if (x <= 1) return x;
    public int mySqrt(int x) {
class Solution {
