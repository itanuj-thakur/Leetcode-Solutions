// Title: Ugly Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/ugly-number/

class Solution {

    public boolean isUgly(int n) {
        while(n%2==0) n/=2;
        while(n%3==0) n/=3;
        while(n%5==0) n/=5;
        if(n!=1) return false;
    }
        if(n==0) return false;
        return true;
