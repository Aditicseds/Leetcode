class Solution {
    public int closestTarget(String[] words, String target, int I) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for (int c = 0; c < n; c++) {
            if (words[c].equals(target)) {
                int d = Math.abs(c - I);
                int dist = Math.min(d, n - d);
                ans = Math.min(ans, dist);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}