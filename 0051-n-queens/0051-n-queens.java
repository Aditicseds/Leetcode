class Solution {
    List<List<String>> ans=new ArrayList<>();
    List<Integer> diag=new ArrayList<>();
    List<Integer> anti=new ArrayList<>();
    List<Integer> col=new ArrayList<>();
    void check(int i, char[][]c){
        int n = c.length;
        if (i == n) {
            List<String> temp = new ArrayList<>();
            for (char[] row : c) {
                temp.add(new String(row));
            }
            ans.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (diag.contains(i - j) || anti.contains(i + j) ||
                col.contains(j)) {
                continue;
            }
            c[i][j] = 'Q';
            diag.add(i - j);
            anti.add(i + j);
            col.add(j);
            check(i + 1, c);
            c[i][j] = '.';
            diag.remove(Integer.valueOf(i - j));
            anti.remove(Integer.valueOf(i + j));
            col.remove(Integer.valueOf(j));
        }

    }
    public List<List<String>> solveNQueens(int n) {
        char[][] c = new char[n][n];
        for (char[] row : c) {
            Arrays.fill(row, '.');
        }
        check(0, c);
        return ans;

    }
}