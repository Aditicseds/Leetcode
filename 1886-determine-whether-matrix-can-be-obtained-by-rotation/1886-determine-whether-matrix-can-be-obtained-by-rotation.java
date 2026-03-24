class Solution {
    public void rotate(int mat[][] ) {
        int m = mat.length ; 
        int o = mat[0].length ;
        for (int i = 0; i < m ; i++ ) {
            for (int j = i ; j < o ; j++ ) {
                int temp = mat[i][j] ; 
                mat[i][j] = mat[j][i] ; 
                mat[j][i] = temp ; 
            }
        }
        for (int i = 0 ; i < m; i++ ) {
            int left = 0 ; 
            int right = o-1 ; 
            while (left < right ) {
                int temp = mat[i][left] ; 
                mat[i][left] = mat[i][right] ; 
                mat[i][right] = temp ; 
                left++ ; 
                right-- ; 
            }
        }
    }
    public boolean isSame(int mat[][] , int target[][]) {
        int m = mat.length ; 
        int o = mat[0].length ; 
        for (int i = 0 ; i < m ; i++ ) {
            for (int j = 0 ; j < o ; j++ ) {
                if (mat[i][j] != target[i][j] )
                 return false ; 
            }
        }
        return true ; 
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0 ; i < 4 ; i++ ) {
            if (isSame(mat,target))
             return true ; 
            rotate(mat) ; 
        }
        return false ; 
    }
}