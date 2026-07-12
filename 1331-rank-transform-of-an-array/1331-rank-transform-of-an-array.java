class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, 0);
        }
        int rank = 1;
        for (int key : map.keySet()) {
            map.put(key, rank++);
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}