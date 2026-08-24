class Solution {
int result = Integer.MAX_VALUE;

    public void solve(int idx, int[] cookies, int[] children, int k) {
        if (idx == cookies.length) {
            int max = 0;
            for (int x : children) {
                max = Math.max(max, x);
            }
            result = Math.min(result, max);
            return;
        }
        giveCookie(0, idx, cookies, children, k);
    }
     public void giveCookie(int child, int idx, int[] cookies,
                           int[] children, int k) {
        if (child == k) {
            return;
        }
        children[child] += cookies[idx];
        solve(idx + 1, cookies, children, k);
        children[child] -= cookies[idx];
        giveCookie(child + 1, idx, cookies, children, k);
    }
    public int distributeCookies(int[] cookies, int k) {
        int[] children = new int[k];
        solve(0, cookies, children, k);
        return result;
    }
}