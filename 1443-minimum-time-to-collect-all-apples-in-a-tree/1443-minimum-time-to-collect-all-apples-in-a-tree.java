class Solution {
    int ans;
    boolean dfs(int node,Map<Integer,List<Integer>> map,List<Boolean> hasApple,boolean[]vis) {

    boolean apple = hasApple.get(node);
    
    for (int child : map.get(node)) {
            if (vis[child]) {
            continue;
        }

        vis[child] = true;

        if (dfs(child, map, hasApple,vis)) {
            ans += 2;
            apple= true;
        }
    }

    return apple;
}
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] a : edges) {
            map.get(a[0]).add(a[1]);
            map.get(a[1]).add(a[0]);
        }
        ans=0;
        boolean vis[]=new boolean[n];
        vis[0] = true; 
        dfs(0,map ,hasApple,vis);
        return ans;

    }
}