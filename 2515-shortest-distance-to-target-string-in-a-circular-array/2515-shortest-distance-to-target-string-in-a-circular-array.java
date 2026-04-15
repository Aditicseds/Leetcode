class Solution {
    public int closestTarget(String[] words, String target, int I) {
        int temp=Integer.MAX_VALUE,n=words.length;
        int i=I,j=I;
        if(words[I].equals(target))return 0;
        for(int c=0;c<words.length;c++){
            if(words[c].equals(target)){
            int clock=(c-I+n)%n;
            int anti=(I-c+n)%n;
            temp=Math.min(temp,Math.min(clock,anti));
            }
            
        }

        if(temp==Integer.MAX_VALUE)return -1;
        return temp;
    }
}