class Solution {
    public int[] dailyTemperatures(int[] t) {
        Deque<Integer> st=new ArrayDeque<>();
        int ans[]=new int[t.length];
        Arrays.fill(ans,0);
        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[st.peek()] < t[i]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        return ans;

    }
}