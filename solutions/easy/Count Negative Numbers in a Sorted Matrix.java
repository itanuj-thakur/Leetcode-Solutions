// Title: Count Negative Numbers in a Sorted Matrix
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length-1,col=0,count=0;
        while(row>=0 && col<grid[row].length){
            if(grid[row][col]<0){
                count+=grid[row].length-col;
            }
        }
    }
            else col++;
        return count;
                row--;
}
