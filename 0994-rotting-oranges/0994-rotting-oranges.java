class Solution {
    int min;
    int directions[][]={ {1,0},{0,1},{0,-1},{-1,0}};
    int bfs(int[][]grid,Queue<Integer> q, int min){
        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0;k<size;k++){
                int rot=q.poll();
                int i=rot/grid[0].length;
                int j=rot%grid[0].length;
                for(int dir[]:directions){
                    int i2 = i + dir[0];
                    int j2 = j + dir[1];
                    if (i2 >= 0 && i2 < grid.length &&
                        j2 >= 0 && j2 < grid[0].length) {
                        if(grid[i2][j2]==1){
                            grid[i2][j2]=2;
                            q.add(i2 * grid[0].length + j2);
                        }    
                    }
                }
            }
            min++;
        }
        return min;
    }

    public int orangesRotting(int[][] grid) {
        //bfs
        Queue<Integer> q= new LinkedList<>();
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(i * grid[0].length + j);
                }
            }
        }
        min=0;
        int ans= bfs(grid,q,min);
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   return -1;
                }
            }
        }
        if(ans==0){
            return 0;
        }

        return ans-1;

    }
}