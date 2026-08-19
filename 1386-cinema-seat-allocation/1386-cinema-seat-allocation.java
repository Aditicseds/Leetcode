class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int seatNumber = seat[1];
            map.computeIfAbsent(row, k -> new HashSet<>())
               .add(seatNumber);
         } 
        int ans=0;  
        for(int i:map.keySet()){
            boolean group1=false;
            boolean group2=false;
            boolean group3=false;
            Set<Integer> set = map.get(i);
            if(!set.contains(2) && !set.contains(3) && !set.contains(4) && !set.contains(5)){
                group1=true;
            }
            if(!set.contains(6) && !set.contains(7) && !set.contains(8) && !set.contains(9)){
               group3=true;
            }
            if(!set.contains(4) && !set.contains(5) && !set.contains(6) && !set.contains(7)){
                group2=true;
            }
            if(group1 && group3){
               ans+=2;
            }
            else if(group1|| group2 || group3){
               ans+=1;
            }
        }
        return ans+2*(n-map.size());
    }
}