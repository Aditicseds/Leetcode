class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int d=0,l=0,r=0;
        for(char c:moves.toCharArray()){
            if(c=='L') l++;
            else if(c=='R') r++;
            else d++;
        }
        return Math.abs(l-r)+d;
    }
}