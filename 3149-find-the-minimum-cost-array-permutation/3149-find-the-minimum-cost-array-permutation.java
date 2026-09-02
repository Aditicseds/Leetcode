class Solution {

    int n;
    int minSum = Integer.MAX_VALUE;
    List<Integer> result = new ArrayList<>();

    void solve(int[] nums, boolean[] visited,
               List<Integer> temp, int sum) {

        // Pruning
        if (minSum <= sum) {
            return;
        }

        // Complete permutation
        if (temp.size() == n) {

            int last = temp.get(temp.size() - 1);
            int first = temp.get(0);

            // Circular edge: last -> first
            sum += Math.abs(last - nums[first]);

            if (sum < minSum) {
                minSum = sum;
                result = new ArrayList<>(temp);
            }

            return;
        }

        // Try every unused number
        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                visited[i] = true;
                temp.add(i);

                int last = temp.get(temp.size() - 2);

                solve(
                    nums,
                    visited,
                    temp,
                    sum + Math.abs(last - nums[i])
                );

                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public int[] findPermutation(int[] nums) {

        n = nums.length;

        boolean[] visited = new boolean[n];

        List<Integer> temp = new ArrayList<>();

        // Lexicographically smallest permutation starts with 0
        temp.add(0);
        visited[0] = true;

        solve(nums, visited, temp, 0);

        // Convert List<Integer> -> int[]
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}