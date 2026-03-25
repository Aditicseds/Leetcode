class Solution {
    public boolean canPartitionGrid(int[][] grid) {
       long sum = 0;
       for(int i=0;i<grid.length;i++) {
        for(int j=0;j<grid[0].length;j++){
            sum+=grid[i][j];
        }
       }

       if(sum%2!=0)return false;
       long sum2=0;
       for(int i=0;i<grid.length-1;i++) {
        for(int j=0;j<grid[0].length;j++){
            sum2+=grid[i][j];
        }
        if(sum2==(sum-sum2))return true;
       }
       sum2=0;
       for(int j=0;j<grid[0].length-1;j++){
        for(int i=0;i<grid.length;i++) {
            sum2+=grid[i][j];
         }
        if(sum2==(sum-sum2))return true;
       }
       return false;
    }
}