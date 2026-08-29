class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int j=0;
        while(j<n){
            int i=j;
            int cnt=1;
            while(i<n-1 && arr[i+1][0]-arr[i][0]<=limit){
                i++;
                cnt++;
            }
            int a[]=new int[cnt];
            //for indexes store
            for(int k=0;k<cnt;k++){
                a[k]=arr[k+j][1];
            }
            Arrays.sort(a);
            for(int k=0;k<cnt;k++){
                nums[a[k]]=arr[k+j][0];
            }    
            j=i+1;


        }
        return nums;




























        // Map<Integer,Integer> map = new HashMap<>();
        // Map<Integer,List<Integer>> l=new HashMap<>();
        // int [] cl=nums.clone();
        // Arrays.sort(cl);
        // int idx=-1;
        // for(int i=0;i<cl.length;i++){
        //   if(i==0||cl[i]-cl[i-1]>limit){
        //     idx++;
        //     l.put(idx,new ArrayList<>());
        //   }
        //    l.get(idx).add(cl[i]);
        //    map.put(cl[i],idx);
        // }
        // Map<Integer,Integer> p=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int index=map.get(nums[i]);
        //     p.put(index,p.getOrDefault(index,-1)+1);
        //     int point=p.get(index);
        //     int first=l.get(index).get(point);
        //     nums[i]=first;
        // }
        // return nums;
    }
}