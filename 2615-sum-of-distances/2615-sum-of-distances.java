class Solution {
    public long[] distance(int[] nums) {
      long ans[]=new long[nums.length];
      Map<Integer,ArrayList<Integer>> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
           map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
      }
      for (ArrayList<Integer> list : map.values()) {
            long totalSum = 0;

            for (int idx : list) {
                totalSum += idx;
            }

            long leftSum = 0;
            int m = list.size();

            for (int i = 0; i < m; i++) {
                int idx = list.get(i);

                long rightSum = totalSum - leftSum - idx;

                long leftPart = (long) i * idx - leftSum;
                long rightPart = rightSum - (long) (m - i - 1) * idx;

                ans[idx] = leftPart + rightPart;

                leftSum += idx;
            }
        }

        return ans;
    }
}