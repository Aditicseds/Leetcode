class Solution {
    public int minOperations(int[][] grid, int x) {
      int a[] =new int[grid.length *grid[0].length];
      int k=0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            a[k++]=grid[i][j];
        }
      }
      Arrays.sort(a);
      int idx = (int)Math.floor(a.length/2);
      int m = a[idx];
      int cnt=0;
      for(int i=0;i<a.length;i++){
        int d = Math.abs(m-a[i]);
        if(d%x!=0)return -1;
        cnt+=d/x;
      }
      return cnt;
    }
}