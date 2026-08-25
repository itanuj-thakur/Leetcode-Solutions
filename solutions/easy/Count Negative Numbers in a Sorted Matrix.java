class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length-1,col=0,count=0;
        while(row>=0 && col<grid[row].length){
            if(grid[row][col]<0){
                count+=grid[row].length-col;
                row--;
            }
            else col++;
        }
        return count;
    }
}
