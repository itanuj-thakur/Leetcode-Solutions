// Title: Categorize Box According to Criteria
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/categorize-box-according-to-criteria/

        long vol=(long)length*width*height;
        if(length>=10000 || width>=10000 || height>=10000 || vol>=1000000000L){
            if(mass>=100) return "Both";
            else return "Bulky";
        }
        else if(mass>=100) return "Heavy";
        else return "Neither";
    public String categorizeBox(int length, int width, int height, int mass) {
class Solution {
